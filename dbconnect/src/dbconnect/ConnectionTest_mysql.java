package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest_mysql {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC 드라이버 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/mydb?serverTime=Asia/Seoul", //url
					"myuser",     //user
					"pwmyuser");  //password
			System.out.println("연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
				}
			}
		}
	}
}
