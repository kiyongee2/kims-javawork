package tcpnetwork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 50001);
			
			System.out.println("[클라이언트] 연결 성공");
			//----------------------------------------------
			//데이터 보내기
			/*String sendMessage = "오늘도 즐거운 하루 되세요~";
			OutputStream os = socket.getOutputStream();
			byte[] bytes = sendMessage.getBytes("utf-8");
			os.write(bytes);
			os.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);*/
			
			//데이터 받기
			/*InputStream is = socket.getInputStream();
			bytes = new byte[1024];
			int readByteCount = is.read(bytes);  //읽은 바이트 수
			//디코딩 문자셋
			String receiveMessage = new String(bytes, 0, readByteCount, "utf-8"); 
			System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);*/
			//--------------------------------------------------------------
			//데이터 보내기
			String sendMessage = "오늘도 즐거운 하루 되세요~";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);
			//---------------------------------------------------------------
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
