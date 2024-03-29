package threads.synchronize;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	//공유하면 다른 쓰레드가 사용할 수 있음
	/*public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() 
				+ ":" + this.memory);
	}*/
	
	//synchronized를 붙이면 동기화 메서드가 되면서 lock을 건다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);  //2초간 일시 정지
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() 
				+ ":" + this.memory);
	}
}
