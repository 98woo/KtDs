package fp_java.ch03.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishDate;

public class FilteringExample {
	
	public static void main(String[] args) {
		
		List<Dish> menu = DishDate.menu;
		
		System.out.println(menu);	// toString 메서드가 있어서 주소값이 아니라 값이 출력됨.
		
		for (Dish dish : menu) {
			if (dish.isVegetarian()) {
				System.out.println("이름: " + dish);	// 메뉴명
				System.out.println("채식여부: " + dish.isVegetarian());	// 채식 여부
			}
		}
		
		// List 를 Stream 으로 변경을 하면
		// Stream 의 Generic 은 List 의 Generic 과 같아진다. filter 의 제네릭이 dish 가 된다.
		menu.stream() // Stream<Dish> 
			// Stream<Dish> = {french fries, rice, season fruit}; 이런 형태의
			.filter(dish -> dish.isVegetarian()) // 완전히 새로운 stream 을 return 한다.
			// forEach (Consumer<Dish>)   새로 반환된 stream 을 반복하며 출력하겠다.
			.forEach((Dish dish) -> {
				System.out.println("Stream 이름: " + dish);	// 메뉴명
				System.out.println("Stream 채식여부: " + dish.isVegetarian());	// 채식 여부
			});
		
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		// 짝수만 추려와서 중복을 제거하고 나머지를 출력한다.
		
		// 짝수만 보관할 리스트
		List<Integer> evenNumbers = new ArrayList<>();
		for (int number : numbers) {
			if (number % 2 == 0) {
				if (!evenNumbers.contains(number)) {
					evenNumbers.add(number);
				}
			}
		}
		System.out.println(evenNumbers); // [2 , 4] 중복 제거 됨.
		
		numbers.stream() // Stream<Integer> 파리미터 타입은 생략 가능.
			   // Stream<Integer> = {2, 2, 4}
			   .filter((Integer n) -> n % 2 == 0)
			   // Stream<Integer> 중복이 제거된 새로운 Stream
			   .distinct()	
			   .forEach((Integer n) -> System.out.println(n));	// forEach Consumer 메서드 레퍼런스. 파라미터 하나, void 반환.
	
		// 메뉴중에서 칼로리가 300보다 큰 것 중 아무거나(정렬 안된 데이터 앞) 3개 가져와서 조회.
		
		// 메뉴 3개만 넣을 리스트
		List<Dish> dishes = new ArrayList<>();
		for (Dish dish : menu) {
			if (dish.getCalories() > 300) {
				dishes.add(dish);
			}
			
			if (dishes.size() == 3) {
				break;
			}
		}
		System.out.println(dishes);
		
		// Stream 풀어보기
		// ~.limit(3) stream 내부에서 앞에 있는 데이터 3개를 가져온다.
		menu.stream()
			.filter((n) -> n.getCalories() > 300)
			.limit(3)
			.forEach((n) -> System.out.println(n));
		
	}
}
