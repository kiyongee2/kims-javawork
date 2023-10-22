package jsonparser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JsonMain {

	public static void main(String[] args) {
		Article article = new Article(3, "제목", "내용입니다.", "2023-10-21");
		
		String articleJson = article.toJson();
		String fileName = article.getId() + ".txt";
		
		//파일에 게시글 쓰기
		try {
			
			OutputStream os = new FileOutputStream(fileName);
			//String msg = "오늘도 좋은하루!";
			//byte[] bytes = msg.getBytes();
			byte[] bytes = articleJson.getBytes();
			os.write(bytes);
			os.flush();
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//파일 불러오기
		String filePath = fileName;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
			//버퍼 선언
			byte[] readBuffer = new byte[fis.available()];
			while(fis.read(readBuffer) != -1) {
			}
			//System.out.println(new String(readBuffer));
			String rs = new String(readBuffer);
			
			rs.replace("{", "");
			rs.replace("}", "");
			String[] data = rs.split(",");
			Article article2 = new Article();
			
			for(int i=0; i<data.length; i++) {
				String[] field = data[i].split(":");
				String fieldName = field[0];
				fieldName = fieldName.replace("\"", "");
				
				String fieldValue = field[1];
				
				if(fieldName.equals("id")) {
					article2.setId(Integer.parseInt(fieldValue));
				}else if(fieldName.equals("title")){
					article2.setTitle(fieldValue);
				}else if(fieldName.equals("content")){
					article2.setContent(fieldValue);
				}else if(fieldName.equals("regDate")){
					article2.setRegDate(fieldValue);
				}
			}
			System.out.println(article2);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
