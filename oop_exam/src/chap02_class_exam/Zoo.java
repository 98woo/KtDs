package chap02_class_exam;

public class Zoo {
	public static void main(String[] args) {
		// Animal 타입의 변수(인스턴스)를 만들어 활용
		
		// 인스턴스를 만드는 문법
		// 자료형 인스턴스명 = new 자료형();
		
		Animal panda = new Animal();
		panda.name = "푸바오";
		panda.hello();
		
		Animal cat = new Animal();
		cat.name = "김춘식";
		cat.hello();
	}
}
