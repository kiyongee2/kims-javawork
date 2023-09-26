package dataio.readwrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteAnimal {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("word.txt");

			//문자열 출력
			String word = "ant bear cow chicken eagle elephant fox horse monkey penguin tiger";
			writer.write(word);
			
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
