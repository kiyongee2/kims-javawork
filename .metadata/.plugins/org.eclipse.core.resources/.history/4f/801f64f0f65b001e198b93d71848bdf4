package dataio.inputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("message2.txt");
			String data = "오늘도 좋은 하루 되세요!\n행운을 빌어요!\n감사합니다.";
			os.write(data.getBytes());
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
