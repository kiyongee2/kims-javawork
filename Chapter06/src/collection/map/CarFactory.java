package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CarFactory {
	private static CarFactory instance;
	private Map<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}

	@Override
	public String toString() {
		return "carMap:" + carMap;
	}
	
	
}
