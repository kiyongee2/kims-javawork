package array2d;

public class Array2dGugudan {

	public static void main(String[] args) {
		//2차원 배열에 구구단 구현
		int[][] gugu = new int[10][10];
		
		for(int i=2; i<gugu.length; i++) {
			for(int j=1; j<gugu.length; j++) {
				gugu[i][j] = i*j;
				System.out.print(i + "x" + j + "=" + gugu[i][j] + "\n");
			}
			System.out.println();
		}
	}
}
