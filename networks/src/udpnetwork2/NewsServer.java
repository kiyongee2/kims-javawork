package udpnetwork2;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	
	private static DatagramSocket datagramSocket;
	//10개의 스레드로 요청을 처리하는 스레드풀 생성
	private static ExecutorService executorService = 
			Executors.newFixedThreadPool(10);
	
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
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					datagramSocket = new DatagramSocket(8100);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						DatagramPacket receivePacket = 
							new DatagramPacket(new byte[1024], 1024);
						datagramSocket.receive(receivePacket);
						
						executorService.execute(()->{
							try {
								String newsKind = new String(receivePacket.getData(), 0, 
										receivePacket.getLength(), "utf-8");
								
								SocketAddress socketAddress = 
										receivePacket.getSocketAddress();
								
								//10개의 뉴스를 클라이언트로 전송
								for(int i=1; i<=10; i++) {
									String data = newsKind + ": 뉴스" + i;
									byte[] bytes = data.getBytes("utf-8");
									DatagramPacket sendPacket = new DatagramPacket(
											bytes, 0, bytes.length, socketAddress);
									datagramSocket.send(sendPacket);
									Thread.sleep(1000);
								}
							} catch (IOException | InterruptedException e) {
							}
						});
					}
				} catch (IOException e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		datagramSocket.close();
		executorService.shutdown();
		System.out.println("[서버] 종료됨");
	}

}
