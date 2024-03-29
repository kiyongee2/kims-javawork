package dataio.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadSample2 {

	public static void main(String[] args) {
		
		try {
			Reader reader = null;
			
			//문자로 읽기
			reader = new FileReader("message.txt");
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
			}
			
			reader.close();
			System.out.println();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
