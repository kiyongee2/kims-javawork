package arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3];
		int[] arr4 = new int[3];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//clone()
		int[] arr3 = arr2.clone();
		/*for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}*/
		for(int i : arr3)
			System.out.println(i);
		
		System.arraycopy(arr1, 0, arr2, 0, 3);
		for(int i : arr2)
			System.out.println(i);
		

	}

}
