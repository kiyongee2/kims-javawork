package arraylist.student2;

import arraylist.student.Subject;

public class Student2 {
	private int studentId;
	private String studentName;
	private Subject[] subjects;
	
	public Student2(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];  //크기가 10인 배열 생성
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject();  //subject 객체 생성
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] == null) {   //비어있을때
				subjects[i] = subject;  //배열에 객체 저장
				break;  //빠져 나옴
			}
		}
	}
	
	//과목 전체 조회
	public void showStudentInfo() {
		int total = 0; //총점
		double avg;    //평균
		int count = 0; //개수
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] != null) {  //비어 있지 않은 요소
				Subject subject = subjects[i];
				total += subject.getScorePoint();
				count++;
				System.out.println("학생 " + studentName + "의 " + subject.getSubjectName() 
					+ " 점수는 " + subject.getScorePoint() + "점 입니다.");
			}
		}
		avg = (double)total / count;
		System.out.printf("학생 %s의 총점은 %d점이고, 평균은 %.1f점입니다.\n", 
								studentName, total, avg);
	}
}
