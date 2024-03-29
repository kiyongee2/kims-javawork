package dataio.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamTest {
	public static void main(String[] args) {
		//객체를 역직렬화해서 파일에 쓰기
		try(FileOutputStream fos = new FileOutputStream("object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			//객체 생성
			Member m1 = new Member("sky123", "김하늘");
			Product p1 = new Product("스마트폰", 1200000);
			int[] number = {1, 2, 3, 4};
			
			//객체를 역직렬화해서 파일에 저장
			oos.writeObject(m1);
			oos.writeObject(p1);
			oos.writeObject(number);
			
			oos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//객체를 역직렬화해서 파일에서 읽기
		try(FileInputStream fis = new FileInputStream("object.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			//파일을 읽고 역직렬화해서 객체로 복원
			Member m2 = (Member)ois.readObject();
			Product p2 = (Product)ois.readObject();
			int[] number2 = (int[])ois.readObject();
			
			//복원된 객체 내용 확인
			System.out.println(m2);
			System.out.println(p2);
			System.out.println(Arrays.toString(number2));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
