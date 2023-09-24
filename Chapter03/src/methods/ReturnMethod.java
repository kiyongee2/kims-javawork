package methods;

public class ReturnMethod {
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static String message() {
		return "오늘도 행복한 하루 되세요";
	}

	public static void main(String[] args) {
		
		int sumVal = add(10, 20);
		System.out.println(sumVal);
		
		String msg = message();
		System.out.println(msg);
	}

}
