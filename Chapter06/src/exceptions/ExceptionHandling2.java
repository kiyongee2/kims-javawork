package exceptions;

public class ExceptionHandling2 {
	
	public static void printLength(String data) {
		//예외 처리: try ~ catch 구문
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();  //예외를 추적하면서 출력함(많이 사용됨)
		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		
		printLength("Hello");
		printLength(null);
		
		System.out.println("[프로그램 종료]");
	}
}
