package ref08_vending_machine_interface;

public class Mart {
	
	public static void main(String[] args) {

		// Sellable (인터페이스)
		// --> (구현) VendingMachine
		// --> (구현) RefundableVendingMachine
		// 인터페이스를 구현 (IS A)
		// VendingMachine is a Sellable
		// RefundableVendingMachine is a Sellable

		Customer customer = new Customer(200_000);
		Sellable machine = new VendingMachine();
		
		machine.insertMeney(customer, "아메리카노");
		machine.pressButton(customer, "아메리카노", 50);
		
		machine.insertMeney(customer, "아메리카노");
		machine.pressButton(customer, "아메리카노", 1); 
		
		machine.printProducts();
		customer.printProduct();
		
		System.out.println("=================================");
		
		// 오버로딩
		Sellable coffeeMachine = new RefundableVendingMachine(400);
		
		coffeeMachine.insertMeney(customer, "카페라떼");
		coffeeMachine.pressButton(customer,"카페라떼", 30);
		
		coffeeMachine.insertMeney(customer, "카페라떼");
		coffeeMachine.pressButton(customer,"카페라떼", 1);
		
		coffeeMachine.printProducts();
		customer.printProduct();
		
	}
}
