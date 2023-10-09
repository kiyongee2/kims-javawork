package udpnetwork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {

	public static void main(String[] args) {
		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			
			//구독하고 싶은 뉴스 주제 보내기
			String data = "정치";
			byte[] bytes = data.getBytes("utf-8");
			DatagramPacket sendPacket 
				= new DatagramPacket(bytes, bytes.length, 
						new InetSocketAddress("localhost", 8001));
			datagramSocket.send(sendPacket);
			
			System.out.println("[클라이언트] 연결 요청 및 데이터 보냄");
			
			//뉴스 받기
			while(true) {
				DatagramPacket receivePacket = 
						new DatagramPacket(new byte[1024], 1024);
				datagramSocket.receive(receivePacket);
				
				//문자열로 변환
				String news = new String (receivePacket.getData(), 0, 
						receivePacket.getLength(), "utf-8");
				System.out.println(news);
				
				//10번째 뉴스를 받으면 while문 종료
				if(news.contains("뉴스10")) {
					break;
				}
			}
			datagramSocket.close();
		} catch (Exception e) {
			System.out.println("[클라이언트] " + e.getMessage());
		}
	}
}
