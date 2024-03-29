package stream.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("콩쥐", 90),	
			new Student("팥쥐", 70),
			new Student("심청", 80)	
		);
		
		//Student로 부터 스트림 얻어 출력하기
		Stream<Student> stdStream = list.stream();
		stdStream.forEach(std -> {
			//System.out.println(std.getName() + " : " + std.getScore());
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + " : " + score);
		});
		
		//stream()은 한 번 사용하면 소모되므로 다시 값을 저장함
		//map() 함수 - 이름, 점수를 각각 출력
		stdStream = list.stream();
		stdStream.map(std -> std.getName())
		         .forEach(s -> System.out.println(s));
		
		stdStream = list.stream();
		stdStream.mapToInt(std -> std.getScore())
		         .forEach(s -> System.out.println(s));
		
		//filter() 함수 - 점수가 90 이상인 학생의 이름 출력
		list.stream().filter(std -> std.getScore() >= 90)
					 .map(std -> std.getName())
					 .forEach(s -> System.out.println(s));
	}
}
