package ref05_vending_machine_arr2;

public class Customer {

	private int wallet;
	// private Product product;
	// Product 배열 사용
	private Product[] productArray;
	
	//생성자
	public Customer(int wallet) {
		this.wallet = wallet;
		this.productArray = new Product[3];
	}
	
	// get
	public int getWallet() {
		return this.wallet;
	}
	
	public Product[] getProduct() {
		return this.productArray;
	}
	
	// 메서드
	public void pay(int price) {
		if(this.wallet < price) {
			System.out.println("잔액이 부족합니다.");
		}
		this.wallet -= price;
	}
	

	public void addStock(String name, int price, int productCount) {
		
		// 코드가 복잡해 -> 메서드로 뽑아내자
		Product product = this.getProductByName(name);
				
		if(product != null) {
//			Product product = this.productArray[i];
			int quantity = product.getQuantity();
			quantity += productCount;
			product.setQuantity(productCount);
		} else {
			int nullIndex = this.getNullIndex(name);
			
			if(nullIndex < 0) {
				return;
			}
			this.productArray[nullIndex] = new Product();
			this.productArray[nullIndex].setName(name);
			this.productArray[nullIndex].setPrice(price);
			this.productArray[nullIndex].setQuantity(productCount);
		}
	}
	
	// 구매이력 확인
	private Product getProductByName(String name) {
		for(Product product : productArray) {
			if(product != null && product.getName().equals(name)) {
				return product;
			}
		}
		return null;
	}
	
	// nullIndex 찾기
	private int getNullIndex(String name) {
		for(int i = 0; i < this.productArray.length; i++) {
			if(this.productArray[i] == null) {
				return i;
			} 
		}
		return -1;
	}
	
	
	public void printProduct() {
		
		System.out.println("고객 잔액: " + this.wallet);
		
		for(Product product : this.productArray) {
			if( product != null) {
				System.out.println("고객 상품 이름: " + product.getName() 
								+ " | 고객 상품 수량: " + product.getQuantity());
			}
		}
	}
}