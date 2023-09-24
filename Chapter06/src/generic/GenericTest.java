package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList cart = new ArrayList();
		cart.add("apple");
		cart.add("egg");
		cart.add("coffee");
		
		String item = (String)cart.get(0);
		System.out.println(item);
	}

}
