package dbdml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertTest3 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##khsql",
					"pwkhsql");
			System.out.println("연결 성공");
			
			//db 작업
			String sql = "INSERT INTO boards(bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) "
					+ "VALUES(SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
			pstmt = conn.prepareStatement(sql, new String[] {"bno", "btitle"});
			pstmt.setString(1, "smartphone5");
			pstmt.setString(2, "삼성폰5");
			pstmt.setString(3, "today");
			pstmt.setString(4, "phone.jpg");
			pstmt.setBlob(5, new FileInputStream("src/dbdata/phone.jpg"));
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);
			
			if(rows == 1) {
				rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1); // bno 칼럼이 1번에 위치
					System.out.println("저장된 bno: " + bno);
					
					String btitle = rs.getString(2);
					System.out.println("저장된 btitle: " + btitle);
				}
			}
			rs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
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
	}
}
