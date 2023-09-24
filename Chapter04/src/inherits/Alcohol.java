package inherits;

public class Alcohol extends Drink{
	
	float alcper;  //알콜 도수

	public Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	
	public static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}

	@Override
	public void printData() {
		System.out.println(name + "(" + alcper + ")\t" + price + "\t" + 
				count + "\t" + getTotalPrice());
	}
}
