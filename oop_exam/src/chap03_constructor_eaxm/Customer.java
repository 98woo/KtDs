package chap03_constructor_eaxm;

/**
 * 자판기 이용 고객
 */
public class Customer {
	
	// 멤버변수
	int wallet;
	int stock;
	
	
	// 생성자
	public Customer(int wallet, int stock) {
		System.out.println("고객 인스턴스를 생성합니다.");
		this.wallet = wallet;
		this.stock = stock;
	}
	
	
	// 메서드
	public void pay(int price) {
		if(this.wallet < price) {
			System.out.println("잔액이 부족합니다.");
		}
		this.wallet -= price;
	}
	
	public void addStock() {
		this.stock++;
	}
	
}
