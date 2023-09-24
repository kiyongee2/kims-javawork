package data_type;

public class OperatorTest2 {

	public static void main(String[] args) {
		// 비트 이동 연산
		int val = 2;   //00000010
		
		System.out.println(val << 1); //00000100
		System.out.println(val << 2); //00001000
		System.out.println(val);
		System.out.println(val >> 1); //00000001
		
		//비트 논리 연산
		int num1 = 5;     //00000101
		int num2 = 10;    //00001010
		
		System.out.println(num1 & num2); //00000000
		System.out.println(num1 | num2); //00001111

	}

}
