package ref03_vending_machine_overloading;

public class VendingMachine {
	
	// 클래스 상수(공용상수)
	/**
	 * 한 번에 구매할 수 있는 제품의 수
	 */
	public static final int PRODUCT_COUNT;
	public static final String MACHINE_NAME;
	
	static {
		PRODUCT_COUNT = 1;
		MACHINE_NAME = "자판기";
	}

	private Product product;
	private int balance;
	
	// 생성자
	public VendingMachine() {
		
		// 클래스 내부 다른 생성자 호출
		// 맨 윗줄에 작성해야함 : 컴파일에러 - Constructor call must be the first statement in a constructor
		this(100_000);
		
//		System.out.println("자판기 생성");
//		this.product = new Product();
//		this.product.setName("콜라");
//		this.product.setPrice(1600);
//		this.product.setQuantity(50);
//		
//		this.balance = 100_000; // 초기값 고정
	}
	
	public VendingMachine(int balance) {
		System.out.println("과자자판기 생성");
		this.product = new Product();
		this.product.setName("홈런볼");
		this.product.setPrice(2000);
		this.product.setQuantity(30);
		
		this.balance = balance; // 초기값 설정 가능
	}
	
	// get
	public Product getProduct() {
		return this.product;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void insertMeney(Customer customer) {
		this.balance += this.product.getPrice();
		customer.pay(this.product.getPrice()); 
	} 
	
	/*
	 * 메서드 오버로딩으로 중복코드 문제 발생
	 * -> 메서드 체이닝으로 해결
	 */
	
	public void pressButton(Customer customer) {
//		if(this.product.getQuantity() <= 0) {
//			System.out.println("상품이 없습니다.");
//			return;
//		}
//		// PRODUCT_COUNT(설정값)만큼 판매
//		int quantity = this.product.getQuantity();
//		quantity -= VendingMachine.PRODUCT_COUNT;
//		this.product.setQuantity(quantity);
//		
//		customer.addStock(this.product.getName(), this.product.getPrice());
		this.pressButton(customer, VendingMachine.PRODUCT_COUNT);
	}
	
	// 메서드 오버로딩
	public void pressButton(Customer customer, int orderCount) {
		if(this.product.getQuantity() <= 0) {
			System.out.println("상품이 없습니다.");
			return;
		}
		// 코드 수정 부분 : orderCount만큼 판매
		int quantity = this.product.getQuantity();
		quantity -= orderCount;
		this.product.setQuantity(quantity);
		
		customer.addStock(this.product.getName(), this.product.getPrice(), orderCount);
	}
}
