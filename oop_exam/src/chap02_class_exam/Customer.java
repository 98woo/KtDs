package chap02_class_exam;

/**
 * 자판기 이용 고객
 */
public class Customer {
	
	// 멤버변수
	int wallet;
	int stock;
	
	// 메서드
	public void pay(int price) {
		if(wallet < price) {
			System.out.println("잔액이 부족합니다.");
		}
		wallet -= price;
	}
	
	public void addStock() {
		stock++;
	}
	
}
