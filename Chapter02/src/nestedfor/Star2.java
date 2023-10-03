package nestedfor;

public class Star2 {

	public static void main(String[] args) {
		/*
		   *
		   **
		   ***
		   ****
		*/
		
		/*int i, j;
		for(i=1; i<5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*
		       *
		      **
		     ***
		    ****
		*/
		
		/*for(i=1; i<5; i++) {
			for(j=1; j<5-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		int lineCount = 4;
		int starCount = 1;
		int spaceCount = lineCount-1;
		int i, j;
		
		/*for(i=1; i<=lineCount; i++) {
			for(j=1; j<=starCount; j++) {
				System.out.print("*");
			}
			starCount += 1;
			System.out.println();
		}*/
		
		for(i=1; i<=lineCount; i++) {
			for(j=1; j<=spaceCount; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=starCount; j++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCount -= 1;
			starCount += 1;
		}
	}

}
