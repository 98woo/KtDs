package chap02_class_exam;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.java = 100;
		student.python = 97;
		student.cpp = 81;
		student.csharp = 99;
		
		int sum = student.getSumAllScores();
		double average = student.getAverage();
		double credit = student.getCourseCredit();
		String grade = student.getABCDE();
		
		System.out.println(sum);
		System.out.println(average);
		System.out.println(credit);
		System.out.println(grade);
	}
}
