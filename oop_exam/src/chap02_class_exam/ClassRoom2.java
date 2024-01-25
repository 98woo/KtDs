package chap02_class_exam;

public class ClassRoom2 {
	public static void main(String[] args) {
		
		Calculator student1 = new Calculator();
		student1.korScore = 100;
		System.out.println(student1.korScore);
		
		Calculator student2 = student1;
		student2.korScore = 0;
		
		System.out.println(student1); // chap02_class_exam.Calculator@279f2327
		System.out.println(student2); // chap02_class_exam.Calculator@279f2327
		
		System.out.println(student1.korScore);
		System.out.println(student2.korScore);
	}

}
