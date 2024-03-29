package dataio.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest {

	public static void main(String[] args) {
		//FileReader에 BufferedReader 보조 스트림 연결
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("message.txt"));
			/*while(true) {
				String data = br.readLine(); //1행을 읽음
				if(data == null) break;
				System.out.println(data);
			}*/
			String data;
			while((data = br.readLine()) != null) { //읽을 행이 없을때까지 반복
				System.out.println(data);
			}
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
