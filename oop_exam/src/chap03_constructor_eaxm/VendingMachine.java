package chap03_constructor_eaxm;
/**
 * 자판기
 */
public class VendingMachine {
	
	// 상수
	final int PRICE = 1300;
	
	// 멤버변수
	int quantity; // 상품수량
	int balance; // 자판기 잔액
	
	
	// 생성자
	public VendingMachine(int quantity, int balance) {
		System.out.println("자판기 인스턴스를 만들었습니다.");
		this.quantity = quantity;
		this.balance = balance;
	}
	
	
	// 메서드
	public void insertMeney(Customer customer) {
		this.balance += this.PRICE;
		customer.pay(this.PRICE);
	} 
	
	public void pressButton(Customer customer) {
		if(this.quantity <= 0) {
			System.out.println("상품이 없습니다.");
			return;
		}
		this.quantity--;
		customer.addStock();
	}

}
