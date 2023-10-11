package dbselect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.User;

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
			
			String sql = "SELECT userid, username, userpassword, userage, useremail "
					+ "FROM users";
			pstmt = conn.prepareStatement(sql);
			
			//검색된 데이터 가져오기
			ResultSet rs = pstmt.executeQuery();
			List<User> userList = new ArrayList<>();
			while(rs.next()) {  //데이터가 있는 동안 반복
				User user = new User(); //객체 1개 생성
				user.setUserId(rs.getString("userId"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userPassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				userList.add(user);  //리스트에 user 객체 저장
			}
			//userList 출력
			/*for(int i=0; i<userList.size(); i++) {
				User user = userList.get(i);
				System.out.println(user);
			}*/
			for(User user : userList) {
				//System.out.println(user);
				System.out.println("userId: " + user.getUserId());
				System.out.println("userName: " + user.getUserName());
				System.out.println("userPassword: " + user.getUserPassword());
				System.out.println("userAge: " + user.getUserAge());
				System.out.println("userEmail: " + user.getUserEmail());
				System.out.println("===========================================");
			}
			//스트림과 람다식 사용
			userList.stream().forEach(user -> System.out.println(user));
		
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
