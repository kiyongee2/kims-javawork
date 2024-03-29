package dataio.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadSample {

	public static void main(String[] args) {
		
		try {
			Reader reader = null;
			
			//문자로 읽기
			reader = new FileReader("c:/file/test.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
			}
			
			reader.close();
			System.out.println();
			
			//문자 배열로 읽기
			reader = new FileReader("c:/file/test.txt");
			char[] data = new char[100];  //읽은 문자를 저장할 배열 생성
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
