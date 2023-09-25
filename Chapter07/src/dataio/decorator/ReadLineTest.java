package dataio.decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("message.txt"));
			/*while(true) {
				String data = br.readLine();
				if(data == null) break;
				System.out.println(data);
			}*/
			String data;
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
