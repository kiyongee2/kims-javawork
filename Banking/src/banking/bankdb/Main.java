package banking.bankdb;

import java.util.Scanner;

import banking.domain.AccountDAO;

public class Main {

	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		Scanner scanner = new Scanner(System.in);
		boolean sw = true;
		
		while(sw) {
			try {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제 | 6.계좌검색 | 7.종료");
				System.out.println("-----------------------------------------------------------------");
				System.out.print("선택> ");
				
				//메뉴 선택 변수, 문자형을 숫자형으로 변환
				int selectNo = Integer.parseInt(scanner.nextLine()); 
				
				if(selectNo == 1) {
					dao.createAccount();  //계좌 생성
				}else if(selectNo == 2) {
					dao.getAccountList(); //계좌 목록
				}else if(selectNo == 3) {
					dao.deposit();        //예금
				}else if(selectNo == 4) {
					dao.withdraw();        //출금
				}else if(selectNo == 5) {
					dao.removeAccount();
				}else if(selectNo == 6) {
					dao.selectAccount();
				}else if(selectNo == 7) {
					sw = false;
				}else {
					System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
				}
			}catch(Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요");
			}
		}//while() 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}

}
