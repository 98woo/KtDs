package fp_java.ch06.reduce;

import java.util.ArrayList;
import java.util.List;

/*
 * reduce
 * 
 *  숫자를 집계하는 것은 쉽다
 *  - 최대값, 최소값, 평균, 합계, 개수 등
 *  
 *  로그 분석(String 등, 메서드 등)은 매우 어렵다
 *  - 메서드 호출 수, 파라미터 개수 등 
 *  
 *  WebApp 개발에서는 로그 분석을 reduce 로 쓸일이 거의 없다
 *  Solution 을 제공해주는데 그것을 쓰는 것이 더 쉽다
 */

public class ReduceExample {

	public static void main(String[] args) {
		// 리스트 생성
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);	
		numbers.add(5);
		numbers.add(3);
		numbers.add(9);
		
		// 총 합계
		// 리스트를 스트림으로 변경. reduce 메서드 사용
		// sum 은 집계된 값, item 은 반복 중인 값. 0이 sum 에 할당되고 sum 과 item 을 더한다. 더한 값이 다시 sum 에 할당되고 반복된다.
		int sumResult = numbers.stream().reduce(0, (sum, item) -> sum + item );
		System.out.println(sumResult);
		
		// 최대값
		// 람다식으로 구현할 수도 있지만 아래 메서드를 쓰는 것이 더 직관적이다.
		int maxNumber = numbers.stream()
			   .reduce(Integer::max)	// reduce 의 반환 타입은 Optional 이다.
			   .orElse(0);
		System.out.println(maxNumber);
		
		// 최소값
		int minNumber = numbers.stream()
							   .reduce(Integer::min)
							   .orElse(0);
		System.out.println(minNumber);
		
		
	}
}
