package synchronizedmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map =
				Collections.synchronizedMap(new HashMap<>());
		//Map<Integer, String> map = new HashMap<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Set<Integer> key = map.keySet();
		for(Integer i : key)
			System.out.println(i + map.get(i));
		
		System.out.println("총 객체수: " + map.size());
	}

}
