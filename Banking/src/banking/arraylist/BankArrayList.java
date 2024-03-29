package banking.arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.domain.Account;

public class BankArrayList {
	//통장 계좌를 만들 ArrayList 생성
	static ArrayList<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
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
					createAccount();  //계좌 생성
				}else if(selectNo == 2) {
				    getAccountList(); //계좌 목록
				}else if(selectNo == 3) {
				    deposit();        //예금
				}else if(selectNo == 4) {
				    withdraw();        //출금
				}else if(selectNo == 5) {
					removeAccount();
				}else if(selectNo == 6) {
					selectAccount();
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
	
	//계좌를 생성하는 함수
	private static void createAccount() {
		System.out.println("-------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호(형식:00-00-000):  ");
			String ano = scanner.nextLine();
			
			String regExp = "\\d{2}-\\d{2}-\\d{3}"; //계좌 번호 형식-정규 표현식
			boolean result = Pattern.matches(regExp, ano);
			if(result) { //result == true
				if(findAccount(ano) != null) {
					System.out.println("이미 등록된 계좌입니다. 다른 계좌를 입력해 주세요.");
				}else {
					while(true) {
						System.out.print("계좌주(한글, 영문):  ");
						String owner = scanner.nextLine();
						
						regExp = "[a-zA-Z가-힣]+";
						result = Pattern.matches(regExp, owner);
						if(result) {
							System.out.print("초기입금액:  ");
							int balance = Integer.parseInt(scanner.nextLine());
							//신규 계좌 생성
							Account newAccount = new Account(ano, owner, balance); 
							accountList.add(newAccount);  //리스트에 추가(저장)
							System.out.println("결과: 계좌가 생성되었습니다.");
							break;
						}else {
							System.out.println("계좌주 이름은 한글과 영문만 가능합니다. 다시 입력해 주세요");
						}
					}
					break;
				}
			}else {
				System.out.println("올바른 계좌 형식이 아닙니다. 다시 입력해 주세요");
			}
		}//while 끝
	}
	
	//계좌 목록을 출력하는 메서드
	private static void getAccountList() {
		for(int i = 0; i < accountList.size(); i++) { //리스트를 순회하면서
			Account account = accountList.get(i);  //등록된 계좌를 가져옴
			System.out.print("계좌번호: " + account.getAno() + "\t");
			System.out.print("계좌주: " + account.getOwner() + "\t");
			System.out.println("잔액: " + account.getBalance());
		}
	}
	
	//계좌에 입금하는 메서드
	private static void deposit() {
		System.out.println("-------------------------------------------");
		System.out.println("예금");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
				System.out.print("입금액:  ");
				int money = Integer.parseInt(scanner.nextLine());
				
				Account account = findAccount(ano);
				//예금 = 잔고 + 예금액
				account.setBalance(account.getBalance() + money);
				System.out.println("결과: 정상 처리 되었습니다.");
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요.");
			}
		}
	}
	
	//계좌에 출금하는 메서드
	private static void withdraw() {
		System.out.println("-------------------------------------------");
		System.out.println("출금");
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
				while(true) {
					System.out.print("출금액:  ");
					int money = Integer.parseInt(scanner.nextLine());
				
					Account account = findAccount(ano);
					//출금 = 잔고 - 출금액
					if(money > account.getBalance()) {
						System.out.println("결과: 잔액이 부족합니다. 다시 입력해 주세요");
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.println("결과: 정상 처리 되었습니다.");
						break;
					}
				} //안쪽 while 끝
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요");
			}
		}// while 끝
	}
	
	//계좌를 삭제하는 메서드
	private static void removeAccount() {
		System.out.println("-------------------------------------------");
		System.out.println(                  "계좌 삭제"                  );
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
				for(int i = 0; i < accountList.size(); i++) {
					String dbAno = accountList.get(i).getAno(); //이미 등록된 계좌번호
					if(dbAno.equals(ano)) { //등록된 계좌와 찾는 계좌가 일치하면
						//Account account = accountList.get(i); //등록 계좌 객체 생성
						//accountList.remove(account);  //계좌 삭제
						accountList.remove(i);
						System.out.println("결과: 계좌가 삭제 되었습니다.");
						break;
					}
				}
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요.");
			}
		}
	}
	
	//특정 계좌 1개를 검색하는 메서드
	private static void selectAccount() {
		System.out.println("-------------------------------------------");
		System.out.println(                  "계좌 검색"                  );
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
				for(int i = 0; i < accountList.size(); i++) {
					String dbAno = accountList.get(i).getAno(); //이미 등록된 계좌번호
					if(dbAno.equals(ano)) { //등록된 계좌와 찾는 계좌가 일치하면
						Account account = accountList.get(i); //등록 계좌 객체 생성
						System.out.print("계좌번호: " + account.getAno() + "\t");
						System.out.print("계좌주: " + account.getOwner() + "\t");
						System.out.println("잔액: " + account.getBalance());
						break;
					}
				}
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요.");
			}
		}
	}

	// 계좌를 검색하는 메서드
	private static Account findAccount(String ano) {
		Account account = null;  //빈 계좌 계정을 할당
		
		for(int i = 0; i < accountList.size(); i++) {
			String dbAno = accountList.get(i).getAno(); //이미 등록된 계좌번호
			if(dbAno.equals(ano)) { //등록된 계좌와 찾는 계좌가 일치하면
				account = accountList.get(i); //등록 계좌 객체 생성
				break;
			}
		}
		return account;
	}
}
