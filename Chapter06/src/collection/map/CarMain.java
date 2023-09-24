package collection.map;

public class CarMain {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata1 = factory.createCar("소나타");
		Car sonata2 = factory.createCar("소나타");
		
		System.out.println(sonata1);
		System.out.println(sonata2);
		System.out.println(sonata1 == sonata2);
		
	}
    
}
