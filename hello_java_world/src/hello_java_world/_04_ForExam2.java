package hello_java_world;

public class _04_ForExam2 {
	public static void main(String[] args) {
		
		// 구구단 2단 ~ 9단
		for(int i = 2; i < 10; i++) {
			
			// 구구단의 배수를 사용하기 위해 반복
			// i단의 1 ~ 9까지
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			
		}
	}

}
