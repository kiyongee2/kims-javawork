package createjson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONTest {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee(100, "김기용");
		Employee e2 = new Employee(101, "조혜원");
		list.add(e1);
		list.add(e2);
		
		//String jsonData = mapper.writeValueAsString(e1);
		String jsonData = mapper.writeValueAsString(list);
		System.out.println(jsonData);
		
		//jsonformatter 사이트에서 보기 - https://jsonformatter.curiousconcept.com/
		
		//파일에 쓰기
		mapper.writeValue(new File("C:/jsondata/employee.json"), list);
		
		//JSON to Java(파싱)
		ObjectMapper mapper2 = new ObjectMapper();
		String json = "[{\"empId\":100,\"name\":\"김기용\"},{\"empId\":101,\"name\":\"조혜원\"}]";
		List<Employee> list2 = mapper2.readValue(json, new TypeReference<>() {});
		list2.forEach(e -> System.out.println(e.getEmpId() + ": " + e.getName()));
		
	}

}

class Employee{
	private int empId;
	private String name;
	
	public Employee() {};
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
