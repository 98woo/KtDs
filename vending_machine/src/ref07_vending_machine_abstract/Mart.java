package ref07_vending_machine_abstract;

public class Mart {
	
	public static void main(String[] args) {

		// Seller
		// --> VendingMachine
		// --> RefundableVendingMachine
		// IS A (다형성)
		// RefundableVendingMachine is a Seller
		// RefundableVedingMachine is a Seller
		// Seller machine = new VendingMachine();
		// Seller machine = new RefundableVendingMachine();

		Customer customer = new Customer(200_000);
		Seller machine = new VendingMachine();
		
		machine.insertMeney(customer, "아메리카노");
		machine.pressButton(customer, "아메리카노", 50);
		
		machine.insertMeney(customer, "아메리카노");
		machine.pressButton(customer, "아메리카노", 1); 
		
		machine.printProducts();
		customer.printProduct();
		
		System.out.println("=================================");
		
		// 오버로딩
		Seller coffeeMachine = new RefundableVendingMachine(400);
		
		coffeeMachine.insertMeney(customer, "카페라떼");
		coffeeMachine.pressButton(customer,"카페라떼", 30);
		
		coffeeMachine.insertMeney(customer, "카페라떼");
		coffeeMachine.pressButton(customer,"카페라떼", 1);
		
		coffeeMachine.printProducts();
		customer.printProduct();
		
	}
}
