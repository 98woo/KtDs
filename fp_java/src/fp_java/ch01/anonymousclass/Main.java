package fp_java.ch01.anonymousclass;

import fp_java.ch01.lambda.Computable;
import fp_java.ch01.lambda.Printable;
import fp_java.ch01.lambda.RandomExtractable;

public class Main {
	
	// nested class (클래스 내부에서 클래스 생성. private 타입으로 생성할 수도 있다. 모든 접근제어지시자 사용 가능)
	public static class SubMain {
		
	}

	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main);	// Main@1f32e575 (
		
		SubMain subMain = new Main.SubMain();	// SubMain 클래스에 static 없으면 에러
		System.out.println(subMain);	// Main$SubMain@2ff4acd0 (Main 클래스의 SubMain 인스턴스. 클래스 안에 있는 클래스로 만든 인스턴스)
		
		// 인터페이스를 인스턴스로 만들려고 시도 -> 불가능. 완성된 메서드가 없기 때문.
		// 인터페이스를 인스턴스로 만들려면 {} 안에서 메서드를 구현해야 한다. -> 익명클래스
		// 익명 클래스가 좋긴 하지만 java 1.8 미만에서는 코드가 장황해진다.
		// 람다를 이용하면 코드를 깔끔하게 작성할 수 있다.
		Computable computer = new Computable() {
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(computer);	// Main$1@2ff4acd0 ($ -> 클래스 내의 클래스)
		
		Computable computer2 = new Computable() {
					
					@Override
					public int add(int num1, int num2) {
						return num1 + num2;
					}
				};
				
				System.out.println(computer2);
				
		Computable computer3 = new Computable() {
					
					@Override
					public int add(int num1, int num2) {
						return num1 + num2;
					}
				};
				
				System.out.println(computer3);
				
				
				// 익명클래스
				Printable printer = new Printable() {
					@Override
					public void print() {
						System.out.println("출력합니다.");
					}
				};
				
				printer.print();
				
				// 람다 (반환되는 타입이 같아야 한다.) print 메서드 void 를 반환함.
				Printable printer2 = () -> System.out.println("출력합니다.");
				printer2.print();
				
				// 익명클래스
				RandomExtractable random = new RandomExtractable() {
					@Override
					public double getRandom() {
						return Math.random();
					}
				};
				double randomNumber = random.getRandom();
				System.out.println(randomNumber);
				
				// 람다
				RandomExtractable random2 = () -> Math.random();
				double randomNumber2 = random2.getRandom();		// 결과를 변수에 넣고 출력해야 값을 구할 수 있다. (그대로 출력하면 주소값이 나온다.)
				System.out.println(randomNumber2);
				
	}
}
