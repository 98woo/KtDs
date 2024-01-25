package chap02_class_exam;

public class VendingMachine {

	final int PRICE = 1300;
	
	int quantity; // 상품수량
	int balance; // 자판기 잔액
	
	public void insertMeney(Customer customer) {
		balance += PRICE;
		customer.pay(PRICE);
	} 

	public void pressButton(Customer customer) {
		if(quantity <= 0) {
			System.out.println("상품이 없습니다.");
			return;
		}
		quantity--;
		customer.addStock();
	}

}
