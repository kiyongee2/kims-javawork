package arrayscores;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		
		boolean sw = true;
		int studentCount = 0; //학생수
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(sw) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			
			int selNum = Integer.parseInt(sc.nextLine());
			
			if(selNum == 1) {
				System.out.print("학생수>");
				studentCount = Integer.parseInt(sc.nextLine());
				scores = new int[studentCount]; //학생수가 배열의 크기임
			}else if(selNum == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selNum == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]=" + scores[i]);
				}
			}else if(selNum == 4) {
				System.out.println("분석>");
			}else if(selNum == 5) {
				sw = false;
			}
		} //while 끝
		
		System.out.println("프로그램 종료!");
		sc.close();
	}

}
