package hello_java_world;

public class _04_IfExamProblem5 {
	public static void main(String[] args) {
		/*
		 * 3. 만약, 나이가 19세 이상이면 "범죄도시1" 영화를 관람할 수 있고
		 *    나이가 15세 이상, 19세 미만이면 "엔드게임" 영화를 관람할 수 있고
		 *    나이가 12세 이상, 15세 미만이면 "해리포터" 영화를 관람할 수 있고
		 *    그렇지 않다면 "뽀로로 극장판 공룡섬 대모험"을 관람할 수 있다
		 */
		int age = 20;
		
		// 조건(숫자) 큰 범위 -> 작은 범위 논리연산 필요x
		// 범위가 역순으로 진행될 때, 논리연산 필요
		if(age >= 19) {
			System.out.println("범죄도시1");
		// 19세 미만 검증 완료
		} else if (age >= 15) {
			System.out.println("엔드게임");
		// 15세 미만 검증 완료
		} else if (age >= 12) {
			System.out.println("해리포터");
		// 12세 미만 검증 완료
		} else {
			System.out.println("뽀로로 극장판 공룡섬 대모험");
		}
		
		// 노놉
		if(age >= 0 && age < 12) {
			System.out.println("뽀로로 극장판 공룡섬 대모험");
		// 19세 미만 검증 완료
		} else if (age >= 12 && age < 15) {
			System.out.println("해리포터");
		// 15세 미만 검증 완료
		} else if (age >= 15 && age < 19) {
			System.out.println("엔드게임");
		// 12세 미만 검증 완료
		} else {
			System.out.println("범죄도시1");
		}
	}
}
