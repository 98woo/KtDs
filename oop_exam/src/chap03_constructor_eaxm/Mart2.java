package chap03_constructor_eaxm;

/**
 * 자판기와 고객이 만나는 마트
 */
public class Mart2 {
	/**
	 * 객체 지향방식으로 개발한 코드
	 */
	public static void main(String[] args) {
		
		// 생성자 : 인스턴스 생성과 동시에 멤버변수 초기화
		Customer customer = new Customer(10000, 0);
		VendingMachine machine = new VendingMachine(10, 1000);
		
		// 캡슐화 : 기능1개에서 여러 처리를 하는 특징
		machine.insertMeney(customer);
		machine.pressButton(customer);
		
		System.out.println("고객 수량: " + customer.stock);
		System.out.println("고객 잔액: " + customer.wallet);
		System.out.println("자판기 수량: " + machine.quantity);
		System.out.println("자판기 잔액: " + machine.balance);
		
	}
}
