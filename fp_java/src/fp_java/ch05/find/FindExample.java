package fp_java.ch05.find;

import java.util.List;
import java.util.Optional;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishDate;

public class FindExample {

	public static void main(String[] args) {
		
		List<Dish> menu = DishDate.menu;
		
		// 스트링 내부에서 임의의 데이터 가져오기
		Optional<Dish> vegeterianDish = menu.stream()
											.filter(dish -> dish.isVegetarian())
											.findAny();
		// Optional1
		// 데이터가 null 일 수도 아닐 수도 있는 특별한 클래스.
		// orElse: Optional Data 가 null 일 때 other 의 값을 반환시키도록 하는 메서드. 데이터가 많이 않으면 첫 번째 데이터가 출력된다. 
		Dish dish = vegeterianDish.orElse(null);
		System.out.println(dish);
		
		Dish fatDish = menu.stream()
						   .filter(d -> d.getCalories() > 100)
						   .findFirst() // Optional<Dish>
						   .orElse(null); // 데이터가 없다면 null을 반환해라.
		System.out.println(fatDish);
		
		
	}
}
