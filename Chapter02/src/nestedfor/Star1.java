package nestedfor;

public class Star1 {

	public static void main(String[] args) {
		int lineCount = 5;
		int starCount = 1;
		int spaceCount = lineCount - 1;
		int i, j;
		
		for(i=0; i<lineCount; i++) {
			for(j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			for(j=0; j<starCount; j++) {
				System.out.print("*");
			}
			for(j=0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}

	}

}
