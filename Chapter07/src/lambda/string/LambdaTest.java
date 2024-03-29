package lambda.string;

@FunctionalInterface
interface PrintString{
	
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		//인터페이스형 객체 선언 - 람다식 구현
		PrintString lambdaPrint;
		lambdaPrint = (str) -> System.out.println(str);
		lambdaPrint.showString("Good Luck!!");
		
		//void형 메서드 호출
		writeString(lambdaPrint);
		
		//return이 있는 메서드 호출
		PrintString prStr = returnPrint();
		prStr.showString("Good Luck!!");
	}
	
	//함수형 인터페이스를 매개변수로 전달
	public static void writeString(PrintString prStr) {
		prStr.showString("Good Luck!!");
	}
	
	//함수형 인터페이스를 반환 자료형으로 사용
	public static PrintString returnPrint() {
		return str -> System.out.println(str);
	}
}
