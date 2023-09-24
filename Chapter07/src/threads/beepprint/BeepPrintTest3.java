package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest3 {

	public static void main(String[] args) {
		//람다식으로 구현
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=1; i<=5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		
		
		for(int i=1; i<=5; i++) {
			try {
				System.out.println("띵");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
