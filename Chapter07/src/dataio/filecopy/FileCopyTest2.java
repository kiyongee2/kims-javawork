package dataio.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		String originFile = "c:/file/img1.jpg";  //원본 파일
		String copyFile = "c:/file/img2.jpg";    //복사 파일
		long start, end;
		
		try(InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile)){
			start = System.currentTimeMillis();
			
			while(true) {
				int num = is.read();  //최대 1024바이트를 읽고 배열에 저장
				if(num == -1) break;
				os.write(num);  //읽은 바이트 수만큼 출력
			}
			os.flush();
			end = System.currentTimeMillis();
			System.out.println("복사 소요 시간: " + (end-start) + "ms");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

