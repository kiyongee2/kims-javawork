package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		//알파벳을 저장할 LinkedList 객체 생성
		List<String> myList = new LinkedList<>();
		
		//자료 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//객체 출력(리스트 형태)
		System.out.println(myList);
		
		//특정 위치에 자료 추가
		myList.add(2, "D");
		System.out.println(myList);
		
		//자료 삭제
		if(myList.contains("B")) {
			myList.remove("B");
		}
		
		//전체 요소 출력
		for(int i = 0; i < myList.size(); i++) {
			String list = myList.get(i);
			System.out.println(list);
		}
		
		System.out.println("==================");
		
		//전체 요소 출력
		for(String list : myList)
			System.out.println(list);
	}
}
