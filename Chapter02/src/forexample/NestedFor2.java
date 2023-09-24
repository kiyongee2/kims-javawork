package forexample;

public class NestedFor2 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				int num = 6*i+j;
				if(num > 27) 
					break;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}

