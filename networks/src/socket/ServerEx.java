package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			//바인딩 포트 - 5001
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();  //연결 수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
				
				//데이터 받기
				byte[] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "utf-8");
				System.out.println("[데이터 받기 성공]" + message);
				
				//데이터 보내기
				OutputStream os = socket.getOutputStream();
				message = "Hello~ Client!";
				bytes = message.getBytes("utf-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				//입,출력 스트림 닫기
				is.close();
				os.close();
				socket.close(); //연결 끊기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
