package ref02_vending_machine;

public class VendingMachine {
	
	// 클래스 상수(공용상수)
	/**
	 * 한 번에 구매할 수 있는 제품의 수
	 */
	public static final int PRODUCT_COUNT;
	public static final String MACHINE_NAME;
	
	// 클래스 상수에 값을 할당하는 방법
	// static block
	static {
		// static 변수/상수의 값을 초기화 하는 공간
		PRODUCT_COUNT = 2;
		MACHINE_NAME = "자판기";
	}

	private Product product;
	private int balance;
	
	// get
	public Product getProduct() {
		return this.product;
	}
	
	public int getBalance() {
		return this.balance;
	}

	public VendingMachine() {
		System.out.println("자판기 인스턴스 생성");
		this.product = new Product();
		this.product.setName("콜라");
		this.product.setPrice(1600);
		this.product.setQuantity(50);
		
		this.balance = 100_000;
	}
	
	public void insertMeney(Customer customer) {
		this.balance += this.product.getPrice();
		customer.pay(this.product.getPrice()); 
	} 
	
	public void pressButton(Customer customer) {
		if(this.product.getQuantity() <= 0) {
			System.out.println("상품이 없습니다.");
			return;
		}
//		this.product.quantity--;
		
		int quantity = this.product.getQuantity();
		quantity -= VendingMachine.PRODUCT_COUNT;
		this.product.setQuantity(quantity);
		
//		this.product.setQuantity((this.product.getQuantity()-1));
		customer.addStock(this.product.getName(), this.product.getPrice());
	}
}
