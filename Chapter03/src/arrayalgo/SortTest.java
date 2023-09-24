package arrayalgo;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = {3, 6, 9, 2, 5, 4};
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			/*
			 * i=0    3, 6, 2, 5, 4, 9
			 * i=1    3, 2, 5, 4, 6, 9
			 * i=2    2, 3, 4, 5, 6, 9
			 * 
			 */
		}
		
		for(int a : arr)
			System.out.print(a + " ");
	}

}
