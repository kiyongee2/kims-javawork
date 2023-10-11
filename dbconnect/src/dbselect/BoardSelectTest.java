package dbselect;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.Board;

public class BoardSelectTest {
	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"c##khsql",
					"pwkhsql");
			System.out.println("연결 성공");
			
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata "
							+ "FROM boards WHERE bwriter = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "sky123");
			
			//검색된 데이터 가져오기
			ResultSet rs = pstmt.executeQuery();
			List<Board> boardList = new ArrayList<>();
			while(rs.next()) {  //데이터가 있는 동안 반복
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfileName(rs.getString("bfilename"));
				board.setBfileData(rs.getBlob("bfiledata"));
				boardList.add(board);
				
				Blob blob = board.getBfileData();
				if(blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("c:/Temp/" + board.getBfileName());
					is.transferTo(os);
					
					/*byte[] data = new byte[1024];
					while(true) {
						int num = is.read(data);
						if(num == -1) break;
						os.write(data, 0, num);
					}*/
					os.flush();
					os.close();
					is.close();
				}
			}
			//boardList 출력
			for(Board board : boardList)
				System.out.println(board);
			
			//boardList.stream().forEach(board -> System.out.println(board));
			
			rs.close();
			pstmt.close();
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
	}//main 끝
}
