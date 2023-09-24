package threads.state;

public class JoinExample {

	public static void main(String[] args) {

		SumThread sumThread = new SumThread();
		sumThread.start(); //메인스레드가 sumThread를 호출하고 일시 정지 상태로 들어감
		
		//생략하면 0이 나옴
		try { //sumThread가 계산을 수행함
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//메인스레드가 결과값을 출력하도록 호출
		System.out.println(sumThread.getSum());
	}
}
