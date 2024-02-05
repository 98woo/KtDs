package chap02_class_exam;

public class ClassRoom1 {
	public static void main(String[] args) {
		
		Calculator student1 = new Calculator();
		
		student1.korScore = 100;
		student1.engScore = 70;
		student1.mathScore = 80;
		student1.progScore = 90;
		
		int sum1 = student1.getSumScore();
		int average1 = student1.getAverageScore();
		String grade1 = student1.getGradeScore();
		
		System.out.println(sum1);
		System.out.println(average1);
		System.out.println(grade1);
	}

}
