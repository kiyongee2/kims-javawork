package polymorphism.taketrans;

public class TakeTrans {
	public static void main(String[] args) {
		Vehicle bus740 = new Bus("740번 버스");
		Person p1 = new Person("박소희", 10000);
		
		p1.take(bus740, 1350);
		p1.showInfo();
		bus740.showInfo();
	}
}
