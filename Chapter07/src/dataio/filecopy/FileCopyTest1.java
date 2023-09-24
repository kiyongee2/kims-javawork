package dataio.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest1 {

	public static void main(String[] args) {
		
		String originFile = "c:/file/img1.jpg";  //원본 파일
		String copyFile = "c:/file/img2.jpg";    //복사 파일
		
		try(InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile)){
			
			while(true) {
				int num = is.read();  //파일 읽기
				if(num == -1) break;
				os.write(num);        //파일 쓰기
			}
			os.flush();
			
			System.out.println("복사 완료!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
