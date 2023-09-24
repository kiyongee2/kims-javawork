package data_type;

public class OperatorTest {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int temp;  //임시 변수
		
		System.out.println("x=" + x + ", y=" + y);
		
		//처리
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x=" + x + ", y=" + y);
	}

}
