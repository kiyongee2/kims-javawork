package lambda.string;

public class StringConcatTest {

	public static void main(String[] args) {
		
		StringConcat concat;
		String str1 = "java";
		String str2 = "11";
		
		concat = (s, v) -> System.out.println(s + " " + v);
		concat.makeString(str1, str2);
		
	}

}
