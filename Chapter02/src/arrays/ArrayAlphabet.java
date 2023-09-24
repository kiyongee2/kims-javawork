package arrays;

public class ArrayAlphabet {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		alphabets[0] = ch;
		System.out.println(alphabets[0]);
		System.out.println((int)alphabets[0]);
		
		alphabets[1] = (char) (ch+1);
		//System.out.println(alphabets[1]);
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++; //ch += 1;
		}
		
		//System.out.println(alphabets[2]); //C
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
	}

}
