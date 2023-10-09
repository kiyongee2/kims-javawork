package dbselect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import userdto.User;

public class UserSelectOneTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##khsql",
					"pwkhsql");
			System.out.println("연결 성공");
			
			//db 작업
			String sql = "SELECT userid, username, userpassword, userage, useremail "
					+ "FROM users WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "cloud");
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userId"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userPassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				System.out.println(user); //user 객체 출력
			
				/*String userId = rs.getString("userid");
				String userName = rs.getString("username");
				String userPassword = rs.getString("userpassword");
				int userAge = rs.getInt("userage");
				String userEmail = rs.getString("useremail");
				
				System.out.println("userId: " + userId);
				System.out.println("userName: " + userName);
				System.out.println("userPassword: " + userPassword);
				System.out.println("userAge: " + userAge);
				System.out.println("userEmail: " + userEmail);*/
			}else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}
			rs.close();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
				System.out.println("연결 끊음");
			}
		}
	}//main 끝
}
