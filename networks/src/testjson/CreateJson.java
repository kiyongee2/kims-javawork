package testjson;

import org.json.JSONObject;

public class CreateJson {

	public static void main(String[] args) {
		//JSON 객체 생성
		JSONObject root = new JSONObject();
		
		//속성 추가
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);
		
		//객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-123-1234");
		root.put("tel", tel);
		
		//JSON 열기
		String json = root.toString();
		
		//콘솔에 출력
		System.out.println(json);

	}

}
