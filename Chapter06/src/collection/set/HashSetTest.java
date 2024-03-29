package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		set.add("Java");
		
		System.out.println("총 객체 수: " + set.size());
		
		//전체 조회
		Iterator<String> ir = set.iterator();  //반복자 얻기
		while(ir.hasNext()) {  //객체 수만큼 반복
			String element = ir.next();  //객체 1개 가져오기
			System.out.println("\t" + element);
		}
		
		//요소 삭제
		if(set.contains("JDBC")) {
			set.remove("JDBC");
		}
		
		System.out.println("총 객체 수: " + set.size());
		
		//전체 조회2
		for(String element : set)
			System.out.println("\t" + element);
	}
}
