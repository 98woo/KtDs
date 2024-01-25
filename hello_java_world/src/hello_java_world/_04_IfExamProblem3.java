package hello_java_world;

public class _04_IfExamProblem3 {
	public static void main(String[] args) {
		/*
		 * 1. 만약, 나이가 15세 이상이고 19세 미만이면
		 *    "엔드게임" 영화를 관람할 수 있다.
		 */
		int age = 10;
		
		if(15 <= age && age < 19) {
			System.out.println("엔드게임 관람 가능");
		} else {
			System.out.println("관람 가능 영화 없음");
		}
	}
}
