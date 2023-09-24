package stream.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		Integer[] num1 = {3, 1, 2, 4};
		
		System.out.println(Arrays.toString(num1));
		
		//num1의 요소 중 2개 복사
		Integer[] num2 = Arrays.copyOf(num1, 2);
		System.out.println(Arrays.toString(num2));
		
		//num1 오름차순 정렬하기
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));	
		
		//num1 뒤집기 - 내림차순 정렬
		Collections.reverse(Arrays.asList(num1));
		System.out.println(Arrays.toString(num1));
	}
}
