package interfaceex.car;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		System.out.println("=============================");
		
		//앞 바퀴 교체
		car.frontLeftTire = new KumTire();
		car.frontRightTire = new KumTire();
		
		car.run();
	}
}
