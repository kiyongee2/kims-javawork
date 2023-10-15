package printf;

public class PrintfTest {

	public static void main(String[] args) {
		// 정수
		System.out.printf("%d", 85);   //85(10진수로 출력)
		System.out.printf("%7d", 85);  //     85(7자리, 빈자리는 공백으로 처리)
		System.out.printf("%-7d", 85); //85     (7자리, 빈자리는 공백으로 처리, 왼쪽정렬)
		System.out.printf("%07d", 85); //0000085(7자리, 빈자리는 0으로 채움)
		System.out.println();

		// 문자열
		System.out.printf("%s", "hello"); 	//hello(문자열로 출력)
		System.out.printf("%7s", "hello");	//  hello(7자리, 빈자리는 공백으로 처리)
		System.out.printf("%-7s", "hello");	//hello  (7자리, 빈자리는 공백으로 처리, 왼쪽정렬)
		System.out.println();

		// 실수
		System.out.printf("%f", 3.14);		//3.140000(10진수 실수, 소수점 이하 자릿수의 default는 6자리)
		System.out.printf("%5.1f", 3.14);	//  3.1(소수점 이하 포함 5자리, 소수점 이하 1자리) 
		System.out.printf("%05.1f", 3.14);	//003.1(소수점 이하 포함 5자리, 소수점 이하 1자리, 빈자리 0)
		System.out.printf("%-5.1f", 3.14);	//3.1  (소수점 이하 포함 5자리, 소수점 이하 1자리, 왼쪽정렬)
	}
}
