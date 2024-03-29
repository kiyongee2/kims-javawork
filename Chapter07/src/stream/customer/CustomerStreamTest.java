package stream.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerStreamTest {

	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(new Customer("이순신", 30, 100));
		customerList.add(new Customer("강감찬", 40, 100));
		customerList.add(new Customer("홍길동", 15, 50));
		
		System.out.println("=== 고객명단 등록된 순서대로 출력 ===");
		Stream<Customer> stream = customerList.stream();
		stream.map(c -> c.getName())
		      .forEach(s -> System.out.println(s));
		
		//stream 재생성
		stream = customerList.stream();
		
		int total = stream.mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		System.out.println("=== 20세 이상 고객명단 정렬하여 출력 ===");
		customerList.stream().filter(c -> c.getAge() >= 20)
		      .map(c -> c.getName())
		      .sorted()
		      .forEach(s -> System.out.println(s));
				 
	}

}
