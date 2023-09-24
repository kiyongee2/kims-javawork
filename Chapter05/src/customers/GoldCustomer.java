package customers;

public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		price -= price * saleRatio;  //가격 = 가격 - 할인된 가격
		bonusPoint += price * bonusRatio;
		return price;
	}
}
