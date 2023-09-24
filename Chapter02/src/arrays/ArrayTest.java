package arrays;

public class ArrayTest {
	public static void main(String[] args) {
		//변수를 이용
		String car1 = "소나타";
		String car2 = "모닝";
		String car3 = "BMW";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println("====================");
		
		//배열을 이용
		//[]를 사용
		//인덱스(0번 부터 시작)로 순서대로 접근함
		//메모리 사용에 효율적이다. 변수는 흩어져서 위치함
		String[] cars = {"소나타", "모닝", "BMW"};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
	}
}

