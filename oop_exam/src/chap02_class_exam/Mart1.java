package chap02_class_exam;

/**
 * 자판기와 고객이 만나는 마트
 */
public class Mart1 {
	/**
	 * 함수 지향방식으로 개발한 코드
	 */
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		VendingMachine machine = new VendingMachine();
		
		customer.stock = 0;
		customer.wallet = 10000;
		machine.balance = 1000;
		machine.quantity = 10;
		
//		machine.insertMeney(customer.pay(machine.PRICE));
//		machine.pressButton();
		customer.addStock();
		
		System.out.println("고객 수량: " + customer.stock);
		System.out.println("고객 잔액: " + customer.wallet);
		System.out.println("자판기 수량: " + machine.quantity);
		System.out.println("자판기 잔액: " + machine.balance);
		
	}
}
