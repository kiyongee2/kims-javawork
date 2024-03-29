package collection.set;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {

	public static void main(String[] args) {
		Set<Employee> hashSet = new HashSet<>();
		
		hashSet.add(new Employee(101, "신유빈"));
		hashSet.add(new Employee(102, "안산"));
		hashSet.add(new Employee(103, "우영우"));
		hashSet.add(new Employee(104, "이강인"));
		hashSet.add(new Employee(102, "안산"));
		
		System.out.println(hashSet.size());
		
		for(Employee emp : hashSet)
			System.out.println(emp);
	}

}
