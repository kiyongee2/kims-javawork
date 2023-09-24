package singleton.student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.setName("김대한");
		Student.serialNum++;
		
		System.out.println(Student.serialNum);
		
		System.out.println("===============================");
		
		Student std2 = new Student();
		std2.setName("장민국");
		Student.serialNum++;
		
		System.out.println(Student.serialNum);
	}
}
