package customers;

import java.util.ArrayList;

public class CustomerTest3 {
	public static void main(String[] args) {
		// 배열로 고객 구현하기
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//고객 객체 생성
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer youl = new GoldCustomer(10040, "이율곡");
		Customer king = new VIPCustomer(10050, "세종대왕", 7777);
		
		//고객 리스트에 저장
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(king);
		
		//보너스 포인트 계산
		int price = 10000;
		
		//고객 정보 출력
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 지불한 비용은 "
					+ cost + "원입니다.");
			System.out.println(customer.showCustomerInfo());
			System.out.println("***************************************************");
		}
	}
}
