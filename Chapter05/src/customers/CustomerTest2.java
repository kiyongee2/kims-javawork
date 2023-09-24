package customers;

public class CustomerTest2 {
	public static void main(String[] args) {
		//자동 형변환(부모 클래스로 객체 생성하기)
		Customer lee = new Customer(1001, "이강인");
		Customer woo = new VIPCustomer(1010, "우영우", 7777);
		
		int price = 10000;
		int cost = lee.calcPrice(price);
		System.out.println(lee.getCustomerName() + "님이 지불한 비용은 "
				+ cost + "원입니다.");
		System.out.println(lee.showCustomerInfo());
		System.out.println("============================================");
		
		price = 20000;
		cost = woo.calcPrice(price);
		System.out.println(lee.getCustomerName() + "님이 지불한 비용은 "
				+ cost + "원입니다."); 
		System.out.println(woo.showCustomerInfo());
	}
}
