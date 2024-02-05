package ref05_vending_machine_arr2;

public class Mart {

	public static void main(String[] args) {
		
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
