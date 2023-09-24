package arraylist.student;

public class ScoreMain {

	public static void main(String[] args) {
		Student std1 = new Student(101, "김기용");
		
		std1.addSubject("국어", 90);
		std1.addSubject("수학", 85);
		std1.addSubject("영어", 78);
		
		std1.showStudentInfo();
	}

}
