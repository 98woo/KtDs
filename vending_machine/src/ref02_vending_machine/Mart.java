package ref02_vending_machine;

public class Mart {

	public static void main(String[] args) {
		
		Customer customer = new Customer(200_000);
		VendingMachine machine = new VendingMachine();
		
		machine.insertMeney(customer);
		machine.pressButton(customer);
		
		machine.insertMeney(customer);
		machine.pressButton(customer);
		
		System.out.println("고객 수량: " + customer.getProduct().getQuantity());
		System.out.println("고객 잔액: " + customer.getProduct().getPrice());
		System.out.println("자판기 상품명: " + machine.getProduct().getName());
		System.out.println("자판기 상품수량: " + machine.getProduct().getQuantity());
		System.out.println("자판기 잔액: " + machine.getBalance());
		
	}

}
