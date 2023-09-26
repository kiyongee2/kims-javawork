package dataio.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadLineTest3 {
	public static void main(String[] args) {
		//FileReader에 BufferedReader 보조 스트림 연결
		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))) {
			String data;
			String[] word = null;
			while((data = br.readLine()) != null) { //읽을 행이 없을때까지 반복
				//System.out.println(data);
				word = data.split(" ");  //공백 문자를 구분기호로 배열 요소화 됨
			}
			System.out.println(Arrays.toString(word)); //배열 객체 출력
			System.out.println(word[0]); //0번 인덱스 객체
			
			//랜덤 출력
			int rand = (int)(Math.random()*word.length);
			System.out.println(rand);
			System.out.println(word[rand]);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
