package hello_java_world;

public class _04_IfExam2 {
	public static void main(String[] args) {
		
		int number = 5;
		
		if(number == 5) {
			int number2 = 1;
			System.out.println(number);
			System.out.println(number2);
		} else {
			int number2 = 2;
			System.out.println(number);
			System.out.println(number2);
		}
		
		System.out.println(number);
//		System.out.println(number2); // Errer: number2 cannot be resolved to a variable
	}
}
