package dataio.inputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/file/test2.db");
			byte[] array = {10, 20, 30};
			
			os.write(array);  //배열의 모든 바이트를 쓰기
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
