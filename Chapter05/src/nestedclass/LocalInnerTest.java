package nestedclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {
		int num = 10;  //인터페이스 상수(final)
		
		class MyRunnable implements Runnable{
			int localNum = 20;

			@Override
			public void run() {
				//num = 20;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		//outer.getRunnable().run();
		
		System.out.println("======================");
		Runnable runner = outer.getRunnable();
		runner.run();
		
	}

}
