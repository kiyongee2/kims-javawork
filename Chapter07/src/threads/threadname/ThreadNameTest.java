package threads.threadname;

public class ThreadNameTest {

	public static void main(String[] args) {
		//현재 이 코드를 실행하는 쓰레드의 정보 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		for(int i=0; i<2; i++) {
			//Thread(작업 스레드) 객체 생성
			Thread threadA = new Thread() {

				@Override
				public void run() {
					//getName() - threaA의 이름을 리턴
					System.out.println(getName() + " 실행");
				}
				
			};
			threadA.start();
		}
		
		for(int i=0; i<2; i++) {
			Thread chatThread = new Thread() {
	
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
				
			};
			chatThread.setName("chat-thread");  //쓰레드 이름 변경
			chatThread.start();
		}
	}
}
