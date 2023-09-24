package array2d;

public class ArrayGugudan {

	public static void main(String[] args) {
		//구구단을 저장할 배열 생성
		int[] gugudan = new int[9];
		int dan = 2;
		
		for(int i=0; i<gugudan.length; i++) {
			gugudan[i] = dan * (i+1);
			System.out.println(dan + "x" + (i+1) + "=" + gugudan[i]);
		}
		
		System.out.println("==================================");
		//구구단 전체 
		for(dan=2; dan<10; dan++) {
			for(int i=0; i<gugudan.length; i++) {
				gugudan[i] = dan * (i+1);
				System.out.println(dan + "x" + (i+1) + "=" + gugudan[i]);
			}
			System.out.println();
		}
	}
}

