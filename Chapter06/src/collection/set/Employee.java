package collection.set;

public class Employee {
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

	@Override
	public String toString() {
		return empId + ", " + empName;
	}
	
	
}
