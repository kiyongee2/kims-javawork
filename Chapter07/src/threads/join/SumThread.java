package threads.join;

//Thread를 상속받은 클래스
public class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() { //1~100까지 더하기
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}
}
