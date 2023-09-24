package interfaceex.car2;

import interfaceex.car.HanTire;
import interfaceex.car.KumTire;
import interfaceex.car.Tire;

public class Car2 {
	Tire[] tires = {
		new HanTire(),
		new HanTire(),
		new KumTire(),
		new KumTire()	
	};
	
	public void run() {
		for(Tire tire : tires)
			tire.roll();
	}
}
