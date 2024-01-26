package ref06_vending_machine_inheri;

public class Mart {
	
//	// 상속 관계일경우 필요없음!
////	public static void printTemeratureProduct(TemperatureProduct tp) {
////		System.out.println(tp.getName()); // null
////	}
//	
////	public static void printProduct(Product p) {
//	/*
//	 * 잘 사용하지 않는 이유
//	 * 1. 매번 형변환하기 귀찮음
//	 * 2. Object : 모든 클래스의 슈퍼클래스 -> Object는 파라미터로 받지 않는다.
//	 */
//	public static void printProduct(Object p) {
//		Product otherP = (Product) p;
//		System.out.println(otherP.getName());
////		System.out.println(p.getName()); // null);
//		// 자식 클래스의 메서드 사용 불가 -> 명시적 형변환을 해보자!
//		// 부모클래스를 강제로 자식클래스로 형변환 할 수 있다.
//		
//		if( p instanceof TemperatureProduct) { // TemperatureProduct는 인스턴스 p의 타입인가?
//			TemperatureProduct tp = (TemperatureProduct) p;
////			System.out.println(p.setIsHot);
////			System.out.println(p.getIsHot(false));
//			tp.setIsHot(true);
//			System.out.println(tp.getIsHot());
//		}
//	}
	
	public static void main(String[] args) {
		// 모든 클래스의 슈퍼클래스는 Object
		
		/*
		 * [ 상속관계 ]
		 * Object
		 * 	--> Product
		 * 		--> TemeratureProduct
		 * Product is a Object
		 * TemeratureProduct is a Product
		 * TemeratureProduct is a Object
		 */
//		Product p = new Product();
//		TemperatureProduct tp = new TemperatureProduct();
//		
//		// 다형성
//		printProduct(tp);
//		printProduct(p);
//		tp.setName("티피!");
////		printTemeratureProduct(p);
		
		
		
		Product p =new Product();
		p.setName("바닐라라떼");
		p.setPrice(2500);
		p.setQuantity(30);
		
		System.out.println(p); // 제품명: 바닐라라떼 | 가격: 2500 | 재고: 30
		
		System.out.println("=================================");
		
		Customer customer = new Customer(200_000);
		VendingMachine machine = new VendingMachine();
		
		machine.insertMeney(customer, "아메리카노");
		machine.pressButton(customer, "아메리카노");
		
		machine.insertMeney(customer, "에스프레소");
		machine.pressButton(customer, "에스프레소"); 
		
		machine.printProducts();
		customer.printProduct();
		
		System.out.println("=================================");
		
		// 오버로딩
		VendingMachine coffeeMachine = new VendingMachine(400);
		
		coffeeMachine.insertMeney(customer, "카페라떼");
		coffeeMachine.pressButton(customer,"카페라떼", 4);
		
		coffeeMachine.insertMeney(customer, "아메리카노");
		coffeeMachine.pressButton(customer,"아메리카노", 2);
		
		coffeeMachine.printProducts();
		customer.printProduct();
		
	}
}
