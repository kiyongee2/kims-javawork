package server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSample {
	//서버 소켓 객체 선언
	private static ServerSocket serverSocket;
	//main 스레드 - 키보드 입력 : 서버 종료하는 작업
	//작업 스레드 - 클라이언트 요청 받아서 수락하는 작업
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
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				//ServerSocket 생성 및 Port 바인딩
				try {
					serverSocket = new ServerSocket(7000);
					System.out.println("[서버] 시작됨");  //실행 : BindException 확인
					
					while(true) { //여러 클라이언트의 연결 요청 수락을 위해 필요함
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						//연결 수락 및 소켓 생성
						Socket socket = serverSocket.accept();
						
						InetSocketAddress isa = 
								(InetSocketAddress)socket.getRemoteSocketAddress();
						//String clientIp = isa.getHostName();  //컴퓨터 이름이 나올수 있음
						String clientIp = isa.getHostString();
						System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
						//웹 브라우저에 ip주소:50001 입력 -> 콘솔에 IP 주소 출력됨
						
						//연결 끊기
						socket.close();
						System.out.println("[서버] " + clientIp + "의 연결을 끊음");
					}
				} catch (IOException e) {
					System.out.println("[서버] " + e.getMessage());
					//System.out.println("[서버] " + e.toString()); //한 번 더 실행
					//e.printStackTrace();
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
		}
	}

}
