package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 50);
		studentLee.setMathSubject("수학", 70);
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("국어", 90);
		studentKim.setMathSubject("수학", 100);
		
		studentLee.showScore();
		studentKim.showScore();
	}

}
