package customers;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer lee = new Customer();
		lee.setCustomerId(1001);
		lee.setCustomerName("이강인");
		
		int price = 10000;
		lee.calcPrice(price);
		System.out.println(lee.showCustomerInfo());
		
		System.out.println("==============================================");
		VIPCustomer woo = new VIPCustomer();
		woo.setCustomerId(1010);
		woo.setCustomerName("우영우");
		woo.setAgentId(7777);
		
		price = 20000;
		woo.calcPrice(price);
		System.out.println(woo.showCustomerInfo());
	}
}
