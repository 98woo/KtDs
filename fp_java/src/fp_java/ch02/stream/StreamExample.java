package fp_java.ch02.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishDate;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Dish> menu = DishDate.menu;
		
		/*
		 * filter - Predicate<T> 
		 * sorted - Comparator<T>
		 * map - Function<T, R>
		 * forEach = Consumer<T> 파라미터 T, void 반환
		 * map = Function<T, R> 반환 시킬 때 타입이 결정된다.(코드를 쓰면 반환 제네릭이 결정된다.) 
		 * flatMap 은 다른 파일을 읽어올 때 쓴다. 배열을 출력해야 할 때 forEach 에 for 문을 사용하면 코드가 길어지기 때문에 이런 경우에도 flatMap을 사용하기도 한다.
		 * peek = Consumer<T> 스트림이 어떻게 흘러가는지 보여준다.(디버그하는 용도로 주로 사용됨) 
		 */
		
		List<String> lowCaloricDishesName = 
			// List<Dish> -> Stream<Dish> 로 변경
			menu.stream()
			// 병렬처리를 하는 스트림
//			menu.parallelStream()
				// 데이터 걸러냄 (굉장히 많이 쓰임)
				// filter(Predicate<Dish>)
				// Predicate -> dish 를 파라미터로 받아서
				// 				boolean 으로 반환한다.
				//				true 가 반환된 것만 새로운 Stream 으로 생성된다. (기존에 생성된 Stream 이 아니다!) 
				.filter(dish -> dish.getCalories() > 300)
				// 데이터 오름차순 정렬(칼로리 기준) 정렬의 기준만 주면 알아서 정리해준다.
				// sorted(Comparator<Dish>) 
				// Comparator -> compare(dish1, dish2)
				//					-> dish1.getCalories() - dish2.getCalories()
				//						-> 오름차순.
				//					-> dish2.getCalories() - dish1.getCalories()
				//						-> 내림차순.
				//					-> Comparator.comparing(Dish::getCalories)
				//						-> 오름차순.
				.sorted(Comparator.comparing(Dish::getCalories))
				.sorted(Comparator.comparing(dish -> dish.getCalories()))	// 원래 코드. 메서드 레퍼런스가 되면서 위의 코드로 작성할 수 있다.
//				.sorted((dish1, dish2) -> dish1.getCalories() - dish2.getCalories()) 람다식
				// 데이터 변경 (Dish -> Name) Map<key, value>와 다른 데이터 변경의 주체가 map 이다. 변경 시키고자 하는 데이터는 map 안에 작성한다.
				// map(Function<Dish, 반환되는 타입>) function 을 요구한다. 
				.map(Dish::getName)
//				.map(dish -> dish.getName()) 
				// 현재까지 처리된 Stream 데이터에서 상위 2개는 제외한다.
				.skip(2)
				// 현재까지 처리된 Stream 데이터에서 가장 상위 데이터 3개만 가져온다.
				.limit(3)
				// List 로 변경. 마무리
				// 최종함수: Stream 을 일반 클래스 혹은 Primitive Type 으로 반환.
				// Collectors.toList() -> Stream 을 List 로 변경.
				// 이 때, Stream 의 제네릭이 List 에도 동리하게 전달.
				// Stream<String> ==> List<String>
				.collect(Collectors.toList());
				// 병렬처리할 경우 다시 정렬
//				.stream()
//				.sorted()
//				.collect(Collectors.toList());
		
		// Stream 에도 foreEach 가 있고 List 에도 forEach 가 있다.
		lowCaloricDishesName
			// Stream 혹은 List 의 데이터를 반복하며 Lambda 를 수행.
			// forEach(Consumer<String>)
			// Consumer -> String 을 파라미터로 받아 VOID 를 반환.
			.forEach(System.out::println);
//			.forEach(menuName -> System.out.println(menuName)); 
	}
}
