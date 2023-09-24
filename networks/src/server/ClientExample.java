package server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {
		try {
			//Socket 생성과 동시에 연결 요청
			Socket socket = new Socket("localhost", 50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) { 
			//IP 또는 도메인 표기 방법이 잘못된 경우
			System.out.println("UnknownHostException" + e.toString());
		} catch (IOException e) {
			//IP 또는 포트번호가 잘못된 경우
			System.out.println("IOException" + e.toString());
		}
	}
}
