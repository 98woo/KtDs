package ref03_vending_machine_overloading;

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
		
		System.out.println("=================================");
		
		// 오버로딩
		VendingMachine snackMachine = new VendingMachine(400);
		
		snackMachine.insertMeney(customer);
		snackMachine.pressButton(customer, 4);
		
		System.out.println("고객 수량: " + customer.getProduct().getQuantity());
		System.out.println("고객 잔액: " + customer.getProduct().getPrice());
		System.out.println("과자자판기 상품명: " + snackMachine.getProduct().getName());
		System.out.println("과자자판기 상품수량: " + snackMachine.getProduct().getQuantity());
		System.out.println("과자자판기 잔액: " + snackMachine.getBalance());
		
	}
}
