package dbselect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import userdto.User;

public class UserSelectAllTest {

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
					+ "FROM users";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			List<User> userList = new ArrayList<>();
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userId"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userPassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				userList.add(user);
			}
			//userList 출력
			for(int i=0; i<userList.size(); i++) {
				User user = userList.get(i);
				System.out.println(user);
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
