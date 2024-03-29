package inetaddress;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		
		try {
			//내 컴퓨터
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소 : " + local.getHostAddress());
			
			//서버 컴퓨터
			//InetAddress host = InetAddress.getByName("www.naver.com");
			//System.out.println(host);
			InetAddress[] hosts = InetAddress.getAllByName("www.naver.com");
			for(InetAddress host : hosts)
				System.out.println(host);
			//DNS - Domain Name Service
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
