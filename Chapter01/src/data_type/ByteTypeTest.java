package data_type;

public class ByteTypeTest {

	public static void main(String[] args) {
		
		int bNum = 0b1010;  //2진수
		int hNum = 0xa;     //16진수
		
		System.out.println(bNum);
		System.out.println(hNum);
		
		//음의 정수 -> 1의 보수에 1을 더함
		int num1 = 0b00000000000000000000000000000101;
		int num2 = 0b11111111111111111111111111111011;
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
