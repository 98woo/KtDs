package fp_java.ch01.lambda;

public class Main {
	
		public static void main(String[] args) {
		// (  ) -> code
		// param -> code
		
		// 익명클래스
		Computable computer1 = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		int addResult = computer1.add(10, 20);
		System.out.println(addResult);
	

		// 인터페이스의 메서드를 바탕으로 익명 클래스를 좀더 간결하게 구현할 수 있다.
		// 람다로 바꿀 수 있는건 functional 인터페이스 뿐이다. (functional 인터페이스 : 메서드가 반드시 하나만 존재해야 한다.)
		// 인터페이스에 메서드가 2개 이상이면 람다가 무엇을 바라봐야 할지 몰라서 에러가 생긴다.
		// @FunctionalInterface 에너테이션으로 람다식 활용하려는 인터페이스를 표시해준다. 람다식의 인터페이스는 FunctionalInterface 에너테이션 추가
		// 인터페이스에서 메서드를 구현 시킬 수 있다.(1.8 이상)  예제) 람다 인터페이스에서 굳이 2개 이상의 메서드를 구현.(default public void printMessage(){};)
		// 함수형 인터페이스 (람다)의 출현으로 default 가 생김.		
		
		// 람다 (정석)
		// add 라는 함수를 람다식으로 표현(타입도 작성하는 것이 정석이다.
		Computable lambdaComputer = (int num1, int num2) -> num1 + num2;	// () 에는 인터페이스 메서드의 파라미터가 들어가고, code 에는 반환값을 적는다.
		int lambdaResult = lambdaComputer.add(10, 20);
		System.out.println(lambdaResult);
		
		// 람다 (실무)
		Computable lambdaComputer2 = (num1, num2) -> num1 + num2;
		int lambdaResult2 = lambdaComputer2.add(30,  10);
		System.out.println(lambdaResult2);
		
		// 람다 (여러 줄 코딩)
		// {} 반환을 시키지 않는다. -> 반환을 해야 할 경우 return을 명시적으로 작성해야 한다. 인터페이스의 메서드 반환타입에 맞춰서 코드를 작성한다.
		Computable lambdaComputer3 = (num1, num2) -> {
			System.out.println("> " + num1);
			System.out.println("> " + num2);
			return num1 + num2;
		};
		int lambdaResult3 = lambdaComputer3.add(4, 2);
		System.out.println(lambdaResult3);
		
		// default 메서드는 참조변수로 그냥 호출하면 된다.
		lambdaComputer3.printMessage();
		lambdaComputer2.printMessage();
		lambdaComputer.printMessage();
	}
}
