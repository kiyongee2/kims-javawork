package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCUtil;

public class AccountDAO {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Scanner scanner = new Scanner(System.in);
	
	//계좌를 생성하는 함수
	public void createAccount() {
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
							
							try {
								conn = JDBCUtil.getConnection();
								String sql = "insert into account (ano, owner, balance) "
										+ "values (?, ?, ?)";
								pstmt = conn.prepareStatement(sql);
								pstmt.setString(1, ano);
								pstmt.setString(2, owner);
								pstmt.setInt(3, balance);
								pstmt.executeUpdate();
								
								System.out.println("결과: 계좌가 생성 되었습니다.");
							} catch (SQLException e) {
								e.printStackTrace();
							} finally {
								JDBCUtil.close(conn, pstmt);
							}
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
	public void getAccountList() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("                            계좌 목록                                   ");
		System.out.println("----------------------------------------------------------------------");
		
		List<Account> accountList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			for(Account account : accountList) {
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔액: " + account.getBalance());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
	}
	
	//계좌에 입금하는 메서드
	public void deposit() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("예금");
		System.out.println("-----------------------------------------------------------------");
		
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
	public void withdraw() {
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
	public void removeAccount() {
		System.out.println("-------------------------------------------");
		System.out.println(                  "계좌 삭제"                  );
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
				
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요.");
			}
		}
	}
	
	//특정 계좌 1개를 검색하는 메서드
	public void selectAccount() {
		System.out.println("-------------------------------------------");
		System.out.println(                  "계좌 검색"                  );
		System.out.println("-------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호:  ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //계좌를 찾았다면(반환값이 있다면)
				
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요.");
			}
		}
	}

	// 계좌를 검색하는 메서드
	public Account findAccount(String ano) {
		Account account = null;  //빈 계좌 계정을 할당
		
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
	}
}
