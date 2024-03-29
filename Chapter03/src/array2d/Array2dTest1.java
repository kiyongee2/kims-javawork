package array2d;

public class Array2dTest1 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arr2 = {
				{10, 20},
				{40, 50, 61}
		};
		int sumVal = 0;
		int count = 0;
		double avg;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				count++;
				sumVal += arr2[i][j];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		avg = (double)sumVal / count;
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println(avg);
		
	}
}
