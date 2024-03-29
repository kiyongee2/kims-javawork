package tcpnetwork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	
	private static ServerSocket serverSocket;

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
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("\n[서버] 연결 요청을 기다림\n");
						Socket socket = serverSocket.accept();
						
						InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
						//String clientIp = isa.getHostName();  //컴퓨터 이름이 나올수 있음
						String clientIp = isa.getHostString();
						System.out.println("[서버] " + clientIp + "의 연결 요청을 수락함");
						//----------------------------------------------------------------
						//데이터 받기
						/*InputStream is = socket.getInputStream();
						byte[] bytes = new byte[1024];  //1KB
						int readByteCount = is.read(bytes); //읽은 바이트 수
						String message = new String(bytes, 0, readByteCount, "utf-8"); //디코딩 문자셋*/
						
						//데이터 보내기
						/*OutputStream os = socket.getOutputStream();
						bytes = message.getBytes("utf-8");  //인코딩 문자셋
						os.write(bytes);
						os.flush();
						System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);*/
						//----------------------------------------------------------------
						
						//데이터 받기
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						String message = dis.readUTF();
						
						//데이터 보내기
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message);
						dos.flush();
						System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);
						//------------------------------------------------------------------
						
						//연결 끊기
						socket.close();
						System.out.println("[서버] " + clientIp + "의 연결을 끊음");
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
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
