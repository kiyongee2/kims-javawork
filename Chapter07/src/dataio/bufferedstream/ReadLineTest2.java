package dataio.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest2 {

	public static void main(String[] args) {
		//FileReader에 BufferedReader 보조 스트림 연결
		try(BufferedReader br = new BufferedReader(
				new FileReader("src/dataio/bufferedstream/ReadLineTest2.java"))){
			int lineNo = 1;  //줄(행) 라인
			while(true) {
				String str = br.readLine();  //1행을 읽음
				if(str == null) break;
				System.out.println(lineNo + " " + str);
				lineNo++;  //행 수 1증가
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
