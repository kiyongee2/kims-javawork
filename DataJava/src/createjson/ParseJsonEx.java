package createjson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonEx {

	public static void main(String[] args) throws IOException {
		//파일로부터 JSON 열기
		//BufferedReader의 readLine() 사용
		BufferedReader br = new BufferedReader(
			new FileReader("C:/jsondata/member.json", Charset.forName("utf-8")));
		
		String json = br.readLine();  //한 행 읽기
		br.close();
		
		//JSON 파싱(해석)
		JSONObject root = new JSONObject(json);
		
		//속성 정보 읽기
		System.out.println("id: " + root.getString("id"));
		System.out.println("name: " + root.getString("name"));
		System.out.println("age: " + root.getInt("age"));
		System.out.println("student: " + root.getBoolean("student"));
		
		//객체 속성 정보 읽기
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home: " + tel.getString("home"));
		System.out.println("mobile: " + tel.getString("mobile"));
		
		//배열 속성 정보 읽기
		JSONArray skill = root.getJSONArray("skill");
		System.out.print("skill: ");
		for(int i=0; i<skill.length(); i++) {
			System.out.print(skill.get(i) + ", ");
		}
	}
}
