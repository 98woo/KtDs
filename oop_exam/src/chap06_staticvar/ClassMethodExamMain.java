package chap06_staticvar;

public class ClassMethodExamMain {
	
	public static void main(String[] args) {
		
		int age = 10;
		boolean isValidAge = ClassMethodExam.isVaildAge(age, 1, 100);
		System.out.println(isValidAge);
	}

}
