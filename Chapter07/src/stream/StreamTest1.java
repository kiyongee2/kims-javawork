package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		//배열로 부터 스트림 얻어서 출력하기
		String[] 과일 = {"수박", "참외", "사과", "배"};
		
		//Stream<String> strStream = Arrays.stream(과일);
		//strStream.forEach(s -> System.out.println(s));
		
		Arrays.stream(과일).forEach(s -> System.out.println(s));
		
		System.out.println("================");
		
		int[] num = {1, 2, 3, 4};
		//Integer[] num = {1, 2, 3, 4};
		
		//Stream<Integer> intStream = Arrays.stream(num);
		//intStream.forEach(n -> System.out.println(n));
	
		Arrays.stream(num).forEach(n -> System.out.println(n));
		
		int sum = Arrays.stream(num).sum();
		int count = (int)Arrays.stream(num).count();
		double avg = (double)sum / count;
		
		System.out.println(sum);
		System.out.println(count);
		System.out.println(avg);
	}

}
