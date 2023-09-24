package interfaceex.car2;

import interfaceex.car.KumTire;

public class CarTest2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.run();
		
		System.out.println("==================");
		
		//바퀴 교체
		myCar.tires[0] = new KumTire();
		myCar.tires[1] = new KumTire();
		
		myCar.run();
	}

}
