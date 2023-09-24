package inherits;

public class SaleStatement {

	public static void main(String[] args) {
		//음료
		Drink tea = new Drink("녹차", 5000, 10);
		//주류
		Alcohol soju = new Alcohol("소주", 4000, 5, 17.5f);
		
		Drink.printTitle();
		tea.printData();
		
		System.out.println();
		
		Alcohol.printTitle();
		soju.printData();
		
		//합계 금액
		int total = tea.getTotalPrice() + soju.getTotalPrice();
		System.out.println("\n***** 합계 금액: " + total + "원 *****");
	}

}
