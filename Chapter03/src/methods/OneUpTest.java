package methods;

public class OneUpTest {

	public static void main(String[] args) {
		//oneUp() 메서드 호출
		System.out.println(oneUp());  //2
		System.out.println(oneUp());  //2
		
		//x값 호출
		//System.out.println(x);  //x는 이미 소멸한 변수임
	}
	
	public static int oneUp() { //x - 지역 변수
		int x = 1;
		x++;
		return x;
	}
}
