package arrays;

public class FindMaxValue{

	public static void main(String[] args) {
		//최대값 찾기
		int[] array = new int[]{1, 5, 3, 8, 2};
		int maxVal = array[0];  //0번 인덱스값을 최대값으로 설정함
		
		for(int i=1; i<array.length; i++) {
			if(array[i] > maxVal)
				maxVal = array[i];
		}
		System.out.println("최대값 : " + maxVal);
		
		//최대값의 위치 찾기
		int maxIdx = 0;  //인덱스 0을 최대값 위치로 설정함
		
		for(int i=1; i<array.length; i++) {
			if(array[i] > array[maxIdx])
				maxIdx = i;
		}
		System.out.println("최대값의 위치 : " + maxIdx);
	}
}
