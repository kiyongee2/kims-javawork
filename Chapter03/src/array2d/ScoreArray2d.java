package array2d;

public class ScoreArray2d {

	public static void main(String[] args) {
		//국어, 수학 과목 성적 - 5명
		int[][] score = {
			{90, 70},
			{80, 55},
			{72, 60},
			{65, 40},
			{80, 80}
		};
		
		int[] total = {0, 0};
		double[] avg = {0.0, 0.0};
		System.out.println(score.length);  //개수
		
		for(int i=0; i<score.length; i++) {
			total[0] += score[i][0];  //국어
			total[1] += score[i][1];  //수학
		}
		avg[0] =  (double)total[0] / score.length;
		avg[1] =  (double)total[1] / score.length;
		
		System.out.println("국어 총점: " + total[0]);
		System.out.println("수학 총점: " + total[1]);
		System.out.println("국어 평균: " + avg[0]);
		System.out.println("수학 평균: " + avg[1]);
	}

}
