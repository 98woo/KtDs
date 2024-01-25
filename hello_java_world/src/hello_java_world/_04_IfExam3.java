package hello_java_world;

public class _04_IfExam3 {
	public static void main(String[] args) {
		
		// double 타입의 난수
		double randomNumber = Math.random();
//		System.out.println(randomNumber);
		
		int answer = (int) (randomNumber * 100);
		int value = 60;
		
		if(answer == value) {
			System.out.println("정답입니다!");
		} else if (answer > value) {
			System.out.println("UP!");
		} else if (answer < value) {
			System.out.println("DOWN!");
		}
		
		System.out.println("정답은 " + answer + "입니다.");
	}
}
