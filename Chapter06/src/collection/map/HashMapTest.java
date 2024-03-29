package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		//이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		//자료 저장
		map.put("이순신", 95);
		map.put("홍길동", 75);
		map.put("강감찬", 85);
		
		//특정 자료 가져오기
		System.out.println(map.get("홍길동"));
		
		System.out.println("객체 수: " + map.size());
		
		//객체 전체 조회
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		//Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println(key + ", " + value);
		}
		
		if(map.containsKey("강감찬")) { //객체가 map에 포함되어 있다면
			map.remove("강감찬");  //객체 삭제
		}
		System.out.println("====================");
		System.out.println("객체 수: " + map.size());
		
		for(String key : keySet)
			System.out.println(key + ", " + map.get(key));
	}
}

