package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest2 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long start, end;
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		
		System.out.println("ArrayList 소요시간: " + (end-start) + "ns");
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		
		System.out.println("LinkedList 소요시간: " + (end-start) + "ns");
	}
}
