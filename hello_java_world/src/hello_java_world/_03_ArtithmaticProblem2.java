package hello_java_world;

public class _03_ArtithmaticProblem2 {
	public static void main(String[] args) {
		int processTime = 145;
//		int minutes = 0;
//		int seconds = 0;
		
		/*
		 * 산술연산자를 이용해
		 * processTime을 분(minute), 초(second)를
		 * 구한다음 minutes, seconds 변수에 할당하고
		 * 출력해보세요
		 */
		int minutes = processTime / 60;
		int seconds = processTime % 60;
		
		System.out.println(minutes + "분 " + seconds + "초");
	}
}
