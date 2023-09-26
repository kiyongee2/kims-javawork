package dataio.readwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("message.txt");

			//문자열 출력
			String message = "오늘도 좋은 하루 되세요!\n행운을 빌어요!\n감사합니다.";
			writer.write(message);
			
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
