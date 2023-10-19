     package board_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample3 {
	
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	
	//생성자
	public BoardExample3() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/mydb?serverTime=Asia/Seoul",
					"myuser",
					"pwmyuser");
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void list() {
		System.out.println("[게시물 목록]");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-4s%-12s%-30s%-30s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------");

		//board 테이블에서 게시물 정보를 가져와서 출력하기
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate"
					+ " FROM board ORDER BY bno DESC";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBtitle(rs.getString("btitle"));
				board.setBdate(rs.getTimestamp("bdate"));
				//board.setBcontent(rs.getString("bcontent"));
				System.out.printf("%-4s%-12s%-30s%-30s \n", 
					board.getBno(),
					board.getBwriter(),
					board.getBdate(),
					board.getBtitle()
				);
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		} 
		//메인 메뉴 호출
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("선택: ");
		String menuNo = scanner.nextLine();
		System.out.println();
		
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
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목: ");
		board.setBtitle(scanner.nextLine());
		System.out.print("내용: ");
		board.setBcontent(scanner.nextLine());
		System.out.print("작성자: ");
		board.setBwriter(scanner.nextLine());
		
		//보조 메뉴 출력
		System.out.println("----------------------------------------");
		System.out.println("1.Ok | 2.Cancel");
		System.out.print("선택: ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			
			try {
				String sql = "INSERT INTO board(btitle, bcontent, bwriter) "
						+ "VALUES(?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}
	
	public void read() {
		//입력 받기
		System.out.println("[게시물 읽기]");
		System.out.print("글번호 입력: ");
		int bno = Integer.parseInt(scanner.nextLine());
		
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate"
					+ " FROM board WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getTimestamp("bdate"));
				
				//게시글 출력
				System.out.println("*****************************************************");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("작성일: " + board.getBdate());
				System.out.println("*****************************************************");
				
				//수정, 삭제, 목록가기 메뉴 생성
				System.out.println("1.Update | 2.Delete | 3.List");
				System.out.print("선택: ");
				String menuNo = scanner.nextLine();
				System.out.println();
				
				if(menuNo.equals("1")) {
					update(board);
				} else if(menuNo.equals("2")) {
					delete(board);
				}
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		//게시물 목록 출력
		list();
	}
	
	public void update(Board board) {
		System.out.println("[수정할 내용 입력]");
		System.out.print("제목: ");
		board.setBtitle(scanner.nextLine());
		System.out.print("내용: ");
		board.setBcontent(scanner.nextLine());
		System.out.print("작성자: ");
		board.setBwriter(scanner.nextLine());
		
		//확인, 취소 메뉴 생성
		System.out.println("1.Ok | 2.Cancel");
		System.out.print("선택: ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = "UPDATE board "
						+ "SET btitle = ?, bcontent = ?, bwriter = ? "
						+ "WHERE bno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.setInt(4, board.getBno());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}
	
	public void delete(Board board) {
		//System.out.println("[게시글 삭제]");
		try {
			String sql = "DELETE FROM board WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		//게시물 목록 출력
		list();
	}
	
	public void clear() {
		System.out.println("[전체 게시물 삭제]");
		System.out.println("----------------------------------------");
		System.out.println("1.Ok | 2.Cancel");
		System.out.print("선택: ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = "TRUNCATE TABLE board";  //모든 데이터 삭제
				pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		//게시물 목록 출력
		list();
	}
	
	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
		System.out.println("*** 게시판을 종료합니다. ***");
		System.exit(0);
	}

	public static void main(String[] args) {
		BoardExample3 boardExample = new BoardExample3();
		boardExample.list();
	}

}
