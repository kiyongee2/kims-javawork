package nestedclass;

class A{
	A(){System.out.println("A 객체 생성");}
	
	class B{
		B(){System.out.println("B 객체 생성");}
		int field1;
		//static int field2;
		void method1() {}
	}
	
	static class C{
		C(){System.out.println("C 객체 생성");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D{
			D(){System.out.println("D 객체 생성");}
			int field1;
			//static int field2;
			void method1() {}
		}
		D d = new D();
		d.field1 = 8;
		d.method1();
	}
}

public class NestedClassTest {

	public static void main(String[] args) {
		
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 5;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 6;
		c.method1();
		A.C.field2 = 7;
		A.C.method2();
		
		a.method();
	}

}
