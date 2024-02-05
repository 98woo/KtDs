package ref03_vending_machine_overloading;

public class Customer {

	private int wallet;
	private Product product;
	
	//생성자
	public Customer(int wallet) {
		System.out.println("고객 인스턴스 생성");
		this.wallet = wallet;
		this.product = new Product();
	}
	
	
	// get
	public int getWallet() {
		return this.wallet;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	// 메서드
	public void pay(int price) {
		if(this.wallet < price) {
			System.out.println("잔액이 부족합니다.");
		}
		this.wallet -= price;
	}
	
	/*
	 * 메서드 오버로딩으로 중복코드 문제 발생
	 * -> 메서드 체이닝으로 해결
	 */
//	public void addStock(String name, int price) {
////		if(this.product.getName() == null) {
////			this.product.setName(name);
////			this.product.setPrice(price);;
////			this.product.setQuantity(VendingMachine.PRODUCT_COUNT);
////		} else {
////			int quantity = this.product.getQuantity();
////			quantity += VendingMachine.PRODUCT_COUNT;
////			this.product.setQuantity(quantity);
////		}
//		this.addStock(name, price, VendingMachine.PRODUCT_COUNT);
//	}
	
	// 메소드 오버로딩 : 공용상수 대신에 파라미터(productCount) 사용
	public void addStock(String name, int price, int productCount) {
		if(this.product.getName() == null) {
			this.product.setName(name);
			this.product.setPrice(price);;
			this.product.setQuantity(productCount);
		} else {
			int quantity = this.product.getQuantity();
			quantity += productCount;
			this.product.setQuantity(quantity);
		}
	}

}