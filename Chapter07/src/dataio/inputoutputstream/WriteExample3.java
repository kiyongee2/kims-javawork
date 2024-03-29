package dataio.inputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) {
		
		try(OutputStream os = new FileOutputStream("C:/file/test3.db")) {
			
			byte[] array = {10, 20, 30, 40, 50};
			
			os.write(array, 1, 3);  //1번 인덱스부터 3개만 쓰기
			
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
