package customers;

public class VIPCustomer extends Customer{
	private int agentId;  //VIP 고객 상담원 아이디
	double saleRatio;     //구매 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	public int getAgentId() {
		return agentId;
	}

	@Override
	public int calcPrice(int price) {
		price -= price * saleRatio;  //가격 = 가격 - 할인된 가격
		bonusPoint += price * bonusRatio;
		return price;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n전문 상담원 Id는 " + agentId + "입니다.";
	}
}
