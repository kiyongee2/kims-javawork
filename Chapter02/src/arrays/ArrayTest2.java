package arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		//정수형 배열의 크기가 4(초기값: 0 0 0 0)
		int[] number = new int[4];  
		
		//배열에 저장
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		
		System.out.println("배열의 개수 : " + number.length);
		
		//특정 위치에 접근(인덱싱)
		System.out.println(number[1]);
		
		//전체 값 조회(출력)
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
