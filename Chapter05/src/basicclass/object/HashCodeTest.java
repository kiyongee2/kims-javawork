package basicclass.object;

class Employee{
	int empId;
	String empName;
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) { //사원의 인스턴스가 obj라면
			Employee employee = (Employee)obj;
			if(empId == employee.empId)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() { //사원 아이디를 반환
		return empId;
	}
}


public class HashCodeTest {

	public static void main(String[] args) {
		String name1 = new String("신유빈");
		String name2 = new String("신유빈");
		
		System.out.println(name1 == name2);      //물리적 주소 다름
		System.out.println(name1.equals(name2)); //논리적으로 동일함
		
		//논리적으로 문자열 동일하도록 재정의 함
		System.out.println(name1.hashCode()); 
		System.out.println(name2.hashCode());
		
		//물리적인 메모리 주소는 다름
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));

		System.out.println("========================");
		
		Employee emp1 = new Employee(101, "장그래");
		Employee emp2 = new Employee(101, "장그래");
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		
		//논리적으로 문자열 동일하도록 재정의 함
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		//물리적인 메모리 주소는 다름
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));
	}
}
