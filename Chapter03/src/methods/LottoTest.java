package methods;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 복권 추첨
		int[] lotto = new int[6];
		
		//번호 생성
		lotto[0] = (int)(Math.random()*45) + 1;
		//System.out.println(lotto[0]);
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			//중복 번호 제거
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j])
					i--;
			}
			/*
			  41 31 31 13 7  -> 31이 중복인 경우
			  i=0       41
			  i=1 j=0   31
			  i=2 j=1   31 중복 -> i-- (다시 생성)
			  i=2 j=2
			  ...
			 */
		}
		
		//번호 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
