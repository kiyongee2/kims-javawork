package methods;

public class MathTest {

	public static void main(String[] args) {
		// Math 함수
		int v1 = Math.abs(-5);
		System.out.println(v1);
		
		long v2 = Math.round(5.67);
		System.out.println(v2);
		
		double v3 = Math.floor(3.3);
		System.out.println(v3);
		
		double rand = Math.random();  //0.0 <= rand < 1.0
		System.out.println(rand);
		
		int dice = (int)(Math.random()*6) + 1;
		System.out.println(dice);

	}
}
