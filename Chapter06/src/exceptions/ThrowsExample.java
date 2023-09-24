package exceptions;

public class ThrowsExample {

	public static void main(String[] args) {
		//호출(사용)한 곳에서 예외 처리함
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		//예외를 미룸
		Class.forName("java.lang.Math2");
	}
}
