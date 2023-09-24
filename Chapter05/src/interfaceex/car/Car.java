package interfaceex.car;

public class Car {
	//필드
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new KumTire();
	Tire backRightTire = new KumTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
