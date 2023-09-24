package methods;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] words = {"river", "mountain", "sky", "earth", "moon",
				"tree", "flower", "cow", "pig", "horse"};
		int n = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("준비되면 엔터");
		sc.nextLine();
		
		while(n <= 10) {
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제 " + n);
			String question = words[rand];
			System.out.println(question);
			//break;
			String answer = sc.nextLine();
			if(answer.equals(question)) {
				System.out.println("통과!!");
				n++;
			}else {
				System.out.println("오타! 다시 도전!");
			}
		}
		System.out.println("게임 종료!");
		sc.close();
	}
}
