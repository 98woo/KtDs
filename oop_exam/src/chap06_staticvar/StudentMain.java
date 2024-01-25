package chap06_staticvar;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		// 합계
		System.out.println(student.getSumAllScores());
		// 평균
		System.out.println(student.getAverage());
		// 학점
		System.out.println(Student.getCourseCredit(Student.average));
		// 등급
		System.out.println(Student.getABCDE(Student.credit));
	}
}
