package singleton.car;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar();
		Car sonata2 = factory.createCar();
		
		System.out.println("신차 번호: " + sonata1.getCarNum());
		System.out.println("신차 번호: " + sonata2.getCarNum());
	}

}
