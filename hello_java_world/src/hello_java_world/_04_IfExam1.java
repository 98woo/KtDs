package hello_java_world;

public class _04_IfExam1 {
	public static void main(String[] args) {
		int number = 7;
		
		if(number == 5) {
			// number가 5와 같을 경우 실행될 코드
			System.out.println("숫자가 5와 같습니다.");
		} else if (number == 7) {
			System.out.println("숫자가 7과 같습니다.");
		} else {
			// number가 5가 아닐 경우 실행될 코드
			System.out.println("숫자가 5가 아닙니다.");
		}
	}
}
