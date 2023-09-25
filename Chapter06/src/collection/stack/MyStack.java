package collection.stack;

import java.util.ArrayList;

public class MyStack {
	
	ArrayList<String> arrayList;
	
	MyStack(){
		arrayList = new ArrayList<>();
	};
	
	void push(String data) {
		arrayList.add(data);
	}
	
	String pop() {
		int len = arrayList.size();
		if(len == 0) {
			System.out.println("자료가 없습니다.");
			return null;
		}
		return arrayList.remove(len-1);
	}
}
