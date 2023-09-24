package arraylist.student2;

public class ScoreMain2 {

	public static void main(String[] args) {
		Student2 yong = new Student2(1001, "김기용");
		
		yong.addSubject("국어", 92);
		yong.addSubject("수학", 85);
		
		yong.showStudentInfo();
	}
}
