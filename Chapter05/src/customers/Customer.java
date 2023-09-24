package customers;

public class Customer {
	protected int customerId;        //고객 아이디
	protected String customerName;   //고객 이름
	protected String customerGrade;  //고객 등급
	int bonusPoint;       //보너스 포인트
	double bonusRatio;    //보너스 적립율 
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int calcPrice(int price) {
		//보너스 포인트 = 가격 x 보너스 적립율
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		//고객 정보
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다";
	}
}
