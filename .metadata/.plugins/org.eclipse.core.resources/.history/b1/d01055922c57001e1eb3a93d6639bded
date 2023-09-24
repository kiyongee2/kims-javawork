package collection.set;

public class Student {
	String number;
	String name;
	
	public Student(String number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return number + ":" + name;
	} 
	
	@Override
	public int hashCode() {
		return Integer.parseInt(number);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(number.equals(student.number))
				return true;
		}
		return false;
	}
}
