package chap02_class_exam;

/**
 * 동물을 표현
 */
public class Animal {
	
	// 동물의 이름
	String name;
	
	// 동물이 인사하는 것
	public void hello() {
		// 메소드(인스턴스 메소드)에는 static을 붙이지 않는다
		System.out.println(name+"입니다. 반가워요.");
	}
}
