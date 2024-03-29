package dataio.decorator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("b.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
			osw.write("오늘도 행복한 하루 되세요~");
			
			osw.flush();
			
			osw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
