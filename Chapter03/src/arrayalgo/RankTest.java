package arrayalgo;

public class RankTest {

	public static void main(String[] args) {
		int[] score = {70, 90, 60, 50, 80};
		int[] rank = new int[5];
		
		for(int i=0; i<score.length; i++) {
			int count = 1;
			for(int j=0; j<score.length; j++) {
				if(score[i] < score[j]) {
					count++;
				}
			}
			rank[i] = count;
		}
		
		for(int i=0; i<rank.length; i++) {
			System.out.print(rank[i] + " ");
		}

	}

}
