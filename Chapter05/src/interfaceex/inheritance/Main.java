package interfaceex.inheritance;

public class Main {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		MyInterface iClass = myClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}

}
