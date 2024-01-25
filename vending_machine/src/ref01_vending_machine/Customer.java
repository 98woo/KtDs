package ref01_vending_machine;

public class Customer {

	int wallet;
//	int stock;
	Product product;
	
	public Customer(int wallet) {
		System.out.println("고객 인스턴스를 생성합니다.");
		this.wallet = wallet;
//		this.stock = stock;
		this.product = new Product();
	}
	
	public void pay(int price) {
		if(this.wallet < price) {
			System.out.println("잔액이 부족합니다.");
		}
		this.wallet -= price; // id=21 customer의 객체 -= 전달받은 price
	}
	
	public void addStock(String name, int price) {
//		this.stock++;
		// 고객이 제로콜라를 구매한 적이 있는지 확인
		// 고객이 제로콜라를 구매한 적이 없다면
		// 고객이 가진 상품의 정보를 제로콜라로 채워준다
		if(this.product.name == null) {
			this.product.name = name;
			this.product.price = price;
			this.product.quantity = 1;
		}
		// 고객이 제로콜라를 구매한 적이있다면
		// 고객이 가진 제로콜라의 수량을 1개 증가시킨다.
		else {
			this.product.quantity++;
		}
	}

}