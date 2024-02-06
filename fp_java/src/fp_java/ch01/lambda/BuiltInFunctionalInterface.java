package fp_java.ch01.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterface {
	
	public static void main(String[] args) {
		
		// boolean test(T t) 
		
		// Predicate : 파라미터 하나를 전달받아, boolean을 반환하는 함수형 인터페이스
		Predicate<Integer> pp = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t >= 19;
			}
			
		};
		
		boolean isAdult = pp.test(20);
		System.out.println(isAdult);
		
		// 구현되지 않은 메서드를 채워주고 호출한다.
		Predicate<Integer> p = (t) -> t >= 19;
		boolean isAdult2 = p.test(15);
		System.out.println(isAdult2);
		
		
		
		// Consumer : 파라미터 하나를 전달받아, void를 반환하는 함수형 인터페이스
		// 제네릭의 타입에 따라 람다 타입이 달라진다.
		// 파라미터가 하나일 때 소괄호 생략 가능
		Consumer<String> c = t -> System.out.println(t);
		c.accept("반갑습니다."); // accept의 파라미터가 t로 간다.
				
		//Function : 파라미터 T를 전달받아 R을 반환하는 함수형 인터페이스
		Function<Boolean, String> f = (t) -> t ? "yes" : "no";
		String result = f.apply(true);
		String result2 = f.apply(false);
		
		System.out.println(result);
		System.out.println(result2);
		
	}
}
