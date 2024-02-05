package ref02_vending_machine;

import ref03_vending_machine_overloading.VendingMachine;

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
	
	public void addStock(String name, int price) {
		if(this.product.getName() == null) {
			this.product.setName(name);
			this.product.setPrice(price);;
			this.product.setQuantity(VendingMachine.PRODUCT_COUNT);
		} else {
//			this.product.quantity++;
			
			int quantity = this.product.getQuantity();
//			quantity++;
			quantity += VendingMachine.PRODUCT_COUNT;
			this.product.setQuantity(quantity);
			
//			this.product.setQuantity((this.product.getQuantity()+1)); 
		}
	}

}