package exceptions;

public class MultiException {

	public static void main(String[] args) {
		//사용자 입력을 받을 경우 - 문자가 입력될 수 있음
		String[] array = {"100", "123a"};
		
		for(int i = 0; i <= array.length; i++) {
			try {
				System.out.println(array[i]);
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]=" + value);
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없는 항목이 있습니다." + e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과되었습니다." + e.getMessage());
			}
		}
	}
}



/*for(int i = 0; i <= array.length; i++) {
System.out.println(array[i]);
//int value = Integer.parseInt(array[i]);
//System.out.println("array[" + i + "]=" + value);
}*/