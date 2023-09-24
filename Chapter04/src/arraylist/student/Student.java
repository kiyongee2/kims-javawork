package arraylist.student;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	//과목 전체 조회
	public void showStudentInfo() {
		int total = 0;
		double avg;
		for(int i=0; i<subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			total += subject.getScorePoint();
			
			System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() 
				+ " 점수는 " + subject.getScorePoint() + "점 입니다.");
		}
		avg = (double)total / subjectList.size();
		System.out.printf("학생 %s의 총점은 %d점이고, 평균은 %.2f점입니다.", studentName, total, avg);
	}
}
