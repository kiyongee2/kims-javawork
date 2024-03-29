 package dataio.bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))) {
			String data;
			String[] word = null;
			while((data = br.readLine()) != null) { //읽을 행이 없을때까지 반복
				word = data.split(" ");  //공백 문자를 구분기호로 배열 요소화 됨
			}
			
			int n = 1;  //문제 번호
			long start, end;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("준비되면 엔터");
			sc.nextLine();
			start = System.currentTimeMillis();
			while(n <= 10) {
				System.out.println("문제 " + n);
				int rand = (int)(Math.random()*word.length);
				String question = word[rand];
				System.out.println(question);   //단어 출제
				String answer = sc.nextLine();  //게이머
				if(answer.equals(question)) {
					System.out.println("통과!!");
					n++;
				}else {
					System.out.println("오타! 다시 도전!");
				}
			}
			end = System.currentTimeMillis();
			System.out.printf("게임 소요: %.2f초", (float)(end-start)/1000);
			sc.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
