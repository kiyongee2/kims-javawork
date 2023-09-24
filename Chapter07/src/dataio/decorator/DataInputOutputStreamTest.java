package dataio.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamTest {
	public static void main(String[] args) {
		try {
			//DataInputStream 클래스의 dis 객체 생성
			//fos 객체를 기반으로 DataOutputStream dos 객체 생성
			FileOutputStream fos = new FileOutputStream("data.db");
			DataOutputStream dos = new DataOutputStream(fos);
			
			//기본 타입 출력
			dos.writeInt(1);
			dos.writeUTF("우영우");
			dos.writeDouble(95.5);
			
			dos.writeInt(2);
			dos.writeUTF("장그래");
			dos.writeDouble(85.5);
			
			dos.flush();
			dos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			//DataInputStream 클래스의 fis 객체 생성
			//fis 객체를 기반으로 DataInputStream dis 객체 생성
			FileInputStream fis = new FileInputStream("data.db");
			DataInputStream dis = new DataInputStream(fis);
			
			for(int i=0; i<2; i++) { //데이터 수만큼 반복
				//기본 타입 읽기
				int order = dis.readInt();
				String name = dis.readUTF();
				double score = dis.readDouble();
				System.out.println(order + " : " + name + " : " + score);
			}
			
			dis.close(); fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
