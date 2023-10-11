package dbdml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardSelectTest {

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
			
			//db 작업, 매개 변수화된 SQL 문 작성
			String sql = "UPDATE boards SET "
					+ "btitle=?, bcontent=?, bfilename=?, bfiledata=? "
					+ "WHERE bno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "notebook2");
			pstmt.setString(2, "LG 그램 노트북");
			pstmt.setString(3, "P1235.png");
			pstmt.setBlob(4, new FileInputStream("src/dbdml/P1235.png"));
			pstmt.setInt(5, 4);
			
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수: " + rows);
			
			pstmt.close();
			//자동으로 auto commit이 됨
		} catch (Exception e) {
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
