package dataio.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("b.txt");
			InputStreamReader isr = new InputStreamReader(is);
			
			int data;
			while((data = isr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
