package array2d;

public class Array2dNumber {

	public static void main(String[] args) {
		//1부터 순차 증가
		int[][] arr = new int[5][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(arr[i].length*i)+j+1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
