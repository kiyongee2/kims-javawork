package dataio.inputoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample4 {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("c.txt");
			for(int i=1; i<=10; i++) {
				String data = i + "번째 줄입니다.\n";
				os.write(data.getBytes());
			}
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
