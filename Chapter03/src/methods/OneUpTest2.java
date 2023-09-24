package methods;

public class OneUpTest2 {
	
	static int x = 1; //정적 변수

	public static void main(String[] args) {
		//oneUp() 메서드 호출
		System.out.println(oneUp());  //2
		System.out.println(oneUp());  //3
		
		//x값 호출
		System.out.println(x);
	}
	
	public static int oneUp() { //x - 매개 변수, 지역 변수
		x = x + 1;  
		return x;
	}
}
