package chap01_oop_exam;

public class _01_Hello {
	
	/**
	 * "안녕하세요"를 출력하는 메소드 정의
	 * 메소드 내부 디버그 : f5
	 */
	public static void sayHello() {
		System.out.println("안녕하세요");		
	}
	
	/**
	 * 이름을 파라미터로 전달하면, "이름씨, 안녕하세요"를 출력한다.
	 * @param name 출력하고 싶은 이름
	 */
	public static void printHello(String name) {
		System.out.println(name + "씨, 안녕하세요");
	}
	
	/**
	 * 클래스 파일을 실행시키는 메소드
	 * @param args (파라미터)
	 */
	public static void main(String[] args) {

		// 라인복사 : ctrl + alt + 방향키
		// 메소드 호출
		sayHello();
		printHello("망곰");
		System.out.println("반갑습니다");
		
	}

}
