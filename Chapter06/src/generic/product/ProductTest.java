package generic.product;

public class ProductTest {

	public static void main(String[] args) {
		Product<TV, String> prod1 = new Product<>();
		TV tv = new TV();
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		
		tv.making();
		System.out.println("모델: " + prod1.getModel());
	}

}
