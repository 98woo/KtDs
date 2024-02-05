package ref01_vending_machine;

public class VendingMachine {

//	final int PRICE = 1300;
	
//	int productQuantity;
	Product product; // id=27
	int balance;

	public VendingMachine() {
		System.out.println("자판기 인스턴스 생성");
		this.product = new Product();
		this.product.name = "콜라";
		this.product.price = 1600;
		this.product.quantity = 50;
		
		this.balance = 100_000;
	}
	
	public void insertMeney(Customer customer) {
		this.balance += this.product.price; // id=24 machine의 잔액 += id=29 product의 가격
		customer.pay(this.product.price); // id=24 machine의 가격을 매개변수로 id=21 customer의 pay() 호출 
	} 
	
	public void pressButton(Customer customer) {
//		if(product.quantity <= 0) {
		if(this.product.quantity <= 0) {
			System.out.println("상품이 없습니다.");
			return;
		}
//		this.quantity--;
		this.product.quantity--;
		customer.addStock(this.product.name, this.product.price);
	}
}
