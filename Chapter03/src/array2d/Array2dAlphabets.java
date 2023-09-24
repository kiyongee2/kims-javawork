package array2d;

public class Array2dAlphabets {

	public static void main(String[] args) {
		//알파벳 대문자 26개를 저장할 이차원 배열 생성
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		//System.out.println(ch);
		//ch = (char) (ch + 1);  //1증가
		//ch++;
		//System.out.println(ch);
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
			}
		}
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
	}

}
