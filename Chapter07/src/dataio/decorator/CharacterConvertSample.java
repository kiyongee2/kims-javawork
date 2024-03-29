package dataio.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertSample {

	public static void main(String[] args) throws IOException {
		
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws IOException{
		OutputStream os = new FileOutputStream("c:/file/test.txt");
		Writer writer = new OutputStreamWriter(os, "utf-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws IOException {
		InputStream is = new FileInputStream("c:/file/test.txt");
		Reader reader = new InputStreamReader(is);
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data, 0, num);
		return str;
	}

}
