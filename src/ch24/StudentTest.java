package ch24;

/*
 *1001학번 Lee, 1002학번 kim
 *lee는 국어, 수학 2과목 수강
 *kim은 국어, 수학, 영어 3과목 수강
 *Lee는 국어 100점, 수학 50점
 *Kim은 국어 70점, 수학85점, 영어100점
 *Mission>
 *Student, Subject 클래스 만들고, ArrayList 이용해서 두 학생의 과목 성적과 총점 출력 
 */

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("================================");
		studentKim.showStudentInfo();
	}

}
