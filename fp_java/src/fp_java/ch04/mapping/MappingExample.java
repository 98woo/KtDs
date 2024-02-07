package fp_java.ch04.mapping;

import java.util.Arrays;
import java.util.List;

public class MappingExample {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("java8", "Lambdas", "In", "Action");
		words.stream() // Stream<String>
			 .map((String str) -> str.length()) // Stream<Integer> 단어 리스트를 이용해 글자들의 길이를 갖는 숫자 리스트를 만든다.
			 									// 반환값이 length() -> Integer 로 결정되어 map 이 Integer 를 반환한다.
			 .forEach((Integer length) -> System.out.println(length));
			 
		/*
		 * 제네릭의 타입은 유지하고 다른 파일을 Map하고 싶다면 flatMap을 사용해야 한다.
		 * 주로 Log 분석할 때 
		 * URL	Action	Parameter 
		 * URL파일에서 찾은 데이터로 Action 을 조회하고자 할 때
		 * 같은 String 타입이지만 파일만 바뀐다. Stream<Stream<Objec>>
		 * .map
		 * .flatMap
		 */
	}
}
