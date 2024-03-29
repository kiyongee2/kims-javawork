package createjson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {

	public static void main(String[] args) throws IOException {
		//JSON 객체 생성
		JSONObject root = new JSONObject();
		
		//속성 추가
		root.put("id", "sky123");
		root.put("name", "이하늘");
		root.put("age", 28);
		root.put("student", true);
		
		//객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-111-2222");
		tel.put("mobile", "010-1234-5678");
		root.put("tel", tel);
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		root.put("skill", skill);
		
		//JSON 열기
		String json = root.toString(); //문자열로 얻기(생성)
		System.out.println(json);
		
		//파일로 저장
		//출력 스트림 객체 생성
		Writer writer = new FileWriter("C:/jsondata/member.json", 
				Charset.forName("utf-8"));
		writer.write(json);  //데이터 쓰기
		
		writer.flush();
		writer.close();
	}
}
