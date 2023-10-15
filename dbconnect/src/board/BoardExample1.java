package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BoardExample1 {
	
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	
	//생성자
	public BoardExample1() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##khsql",
					"pwkhsql");
			//System.out.println("db 연결 성공!!");
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-4s%-12s%-12s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-4s%-12s%-12s%-40s\n", 
							"1", "today12", "2023.10.13", "오늘도 좋은하루 되세요~");
		System.out.println();
		
		//메인 메뉴 호출
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("선택: ");
		String menuNo = scanner.nextLine();
		
		switch(menuNo) {
		case "1":
			create(); break;
		case "2":
			read(); break;
		case "3":
			clear(); break;
		case "4":
			exit(); break;
		}
	}
	
	public void create() {
		System.out.println("create() 메서드 실행됨");
		list();
	}
	public void read() {
		System.out.println("read() 메서드 실행됨");
		list();
	}
	public void clear() {
		System.out.println("clear() 메서드 실행됨");
		list();
	}
	public void exit() {
		System.out.println("*** 게시판을 종료합니다. ***");
		System.exit(0);
	}
	public static void main(String[] args) {
		BoardExample1 boardExample = new BoardExample1();
		boardExample.list();
	}
}
