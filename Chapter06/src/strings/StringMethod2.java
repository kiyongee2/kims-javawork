package strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethod2 {

	public static void main(String[] args) {
		
		String[] season = new String[4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<season.length; i++) {
			System.out.print("계절을 입력하시오: ");
			season[i] = sc.nextLine();
			if(season[i].equals("봄") || season[i].equals("여름") ||
					season[i].equals("가을") || season[i].equals("겨울")) {
				System.out.println("계절이 맞습니다.");
			}else {
				System.out.println("계절이 아닙니다. 다시 입력하세요: ");
				i--;
			}
		}
		System.out.println(Arrays.toString(season));
		sc.close();
	}
}
