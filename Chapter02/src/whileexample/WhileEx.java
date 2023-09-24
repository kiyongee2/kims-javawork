package whileexample;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		
		while(i < 10) {
			i++;
			//sum = sum + i;
			sum += i;
			System.out.println("i=" + i + ", sum=" + sum);
		}
		System.out.println(sum);

	}

}
