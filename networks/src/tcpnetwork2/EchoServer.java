package tcpnetwork2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {
	private static ServerSocket serverSocket;
	private static ExecutorService executorService 
		= Executors.newFixedThreadPool(10);

	public static void main(String[] args) {
		System.out.println("============================================");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("============================================");
		//TCP 서버 시작
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		//TCP 서버 종료
		stopServer();
	}
	
	public static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(7000); //ServerSocket 생성 및 Port 바인딩
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						Socket socket = serverSocket.accept();
						
						executorService.execute(()->{
							try {
								InetSocketAddress isa 
									= (InetSocketAddress)socket.getRemoteSocketAddress();
								String clientIp = isa.getHostString();
								System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
								
								//데이터 받기
								DataInputStream dis = new DataInputStream(socket.getInputStream());
								String message = dis.readUTF();
								
								//데이터 보내기
								DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
								dos.writeUTF(message);
								dos.flush();
								System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);
								
								//연결 끊기
								socket.close();
								System.out.println("[서버] " + clientIp + "의 연결을 끊음");
							}catch(IOException e) {
								System.out.println(e.getMessage());
							}
						});
					}
				} catch (IOException e) {
					System.out.println("[서버] " + e.toString());
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		try {
			//서버 소켓을 닫고 Port 언바인딩 함
			serverSocket.close();
			executorService.shutdown();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
		}
	}
}
