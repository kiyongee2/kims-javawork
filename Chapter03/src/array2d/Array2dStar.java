package array2d;

public class Array2dStar {

	public static void main(String[] args) {
		char[][] a = new char[5][5];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]= '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<i+1; j++) {
				a[i][j]= '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
