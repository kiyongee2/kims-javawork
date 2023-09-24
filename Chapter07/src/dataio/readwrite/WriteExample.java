package dataio.readwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("c:/file/test.txt");
			
			//1. 한문자 출력
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			//char 배열 출력
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);

			//문자열 출력
			writer.write("FGH");
			
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
