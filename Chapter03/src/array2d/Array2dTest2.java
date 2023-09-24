package array2d;

public class Array2dTest2 {

	public static void main(String[] args) {
		int[][] household = new int[5][3];
		household[2] = new int[1];  
		
		System.out.printf("5층 %d세대\n", household[4].length);
		System.out.printf("4층 %d세대\n", household[3].length);
		System.out.printf("3층 %d세대\n", household[2].length);  //1세대
		System.out.printf("2층 %d세대\n", household[1].length);
		System.out.printf("1층 %d세대\n", household[0].length);	
	}
}
