package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		//var map = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<>();
		
		int idx = 0;
		map.put("Java", ++idx);
		map.put("C", ++idx);
		map.put("C++", ++idx);
		
		System.out.println(idx);
		System.out.println(map.size());
		
		Set<String> keys = map.keySet();
		
		System.out.printf("%d", keys.size());
		
		/*if(map.containsKey("C"))
			map.remove("C");*/
		
		keys.forEach(key -> System.out.println(key));
	}

}
