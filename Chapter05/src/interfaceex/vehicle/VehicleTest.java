package interfaceex.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		//인터페이스에서 매개 변수의 다형성
		Driver driver = new Driver();

		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		//강제 타입 변환 - 인터페이스 타입으로 객체 생성
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
	}
}
