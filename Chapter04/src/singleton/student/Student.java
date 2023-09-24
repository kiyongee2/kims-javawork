package singleton.student;

public class Student {
	static int serialNum = 1000;
	int id;
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
