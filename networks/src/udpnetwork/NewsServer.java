package udpnetwork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

public class NewsServer {
	private static DatagramSocket datagramSocket;

	public static void main(String[] args) {
		System.out.println("============================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("============================================");
		
		//UDP 서버 시작
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		//UDP 서버 종료
		stopServer();
	}
	
	public static void startServer() {
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					datagramSocket = new DatagramSocket(8001);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						//클라이언트가 구독하고 싶은 뉴스 종류 받기
						DatagramPacket receivePacket 
							= new DatagramPacket(new byte[1024], 1024);
						System.out.println("클라이언트의 희망 뉴스 종류를 얻기 위해 대기함");
						datagramSocket.receive(receivePacket);
						
						String newsKind = new String(receivePacket.getData(), 0, 
								receivePacket.getLength(), "utf-8");
						
						//클라이언트에게 보내려면 IP와 Port 얻어야 함
						SocketAddress socketAddress =
								receivePacket.getSocketAddress();
						
						//10개의 뉴스를 클라이언트로 전송
						for(int i=1; i<=10; i++) {
							String data = newsKind + ": 뉴스" + i;
							byte[] bytes = data.getBytes("utf-8");
							DatagramPacket sendPacket = new DatagramPacket(bytes, 0, 
									bytes.length, socketAddress);
							datagramSocket.send(sendPacket);
							Thread.sleep(1000);
						}
					}
				} catch (Exception e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}

}
