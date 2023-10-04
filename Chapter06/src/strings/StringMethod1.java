package strings;

import java.util.Scanner;

public class StringMethod1 {

	public static void main(String[] args) {
		
		//String personId = "951005-1234567";  //주민등록번호
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요: ");
		String personId = scanner.nextLine();
		
		String firstNum = personId.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = personId.substring(7);
		System.out.println(secondNum);
		
		//성별 구분
		char gender = personId.charAt(7);
		if(personId.length() == 14) {
			if(gender == '1' || gender == '3') {
				System.out.println("남자");
			}
			if(gender == '2' || gender == '4') {
				System.out.println("여자");
			}
		}else {
			System.out.println("잘못된 주민번호 형식입니다.");
		}
		scanner.close();
	}
}
