package ref01_vending_machine;

public class Mart {

	public static void main(String[] args) {
		
		Customer customer = new Customer(200_000); // id=21
		VendingMachine machine = new VendingMachine(); // id=24
		
		machine.insertMeney(customer); // customer(id=21)을 매개변수로 machine(id=24)의 메서드 호출
		machine.pressButton(customer);
		
		machine.insertMeney(customer);
		machine.pressButton(customer);
		
		System.out.println("고객 수량: " + customer.product.quantity);
		System.out.println("고객 잔액: " + customer.wallet);
		System.out.println("자판기 상품명: " + machine.product.name);
		System.out.println("자판기 상품수량: " + machine.product.quantity);
		System.out.println("자판기 잔액: " + machine.balance);
		
	}

}
