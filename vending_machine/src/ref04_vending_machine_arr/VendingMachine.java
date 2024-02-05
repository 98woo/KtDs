package ref04_vending_machine_arr;

public class VendingMachine {
	
	// 클래스 상수(공용상수)
	public static final int PRODUCT_COUNT;
	public static final String MACHINE_NAME;
	
	static {
		PRODUCT_COUNT = 1;
		MACHINE_NAME = "자판기";
	}

	// private Product product;
	// Product 배열 사용
	private Product[] productArray; 
	private int balance;
	
	// 생성자
	public VendingMachine() {
		this(100_000);
	}
	
	public VendingMachine(int balance) {
		System.out.println("Coffee Machine");
		this.productArray = new Product[3];
		
		this.productArray[0] = new Product();
		this.productArray[0].setName("아메리카노");
		this.productArray[0].setPrice(1000);
		this.productArray[0].setQuantity(50);
		
		this.productArray[1] = new Product();
		this.productArray[1].setName("카페라떼");
		this.productArray[1].setPrice(2000);
		this.productArray[1].setQuantity(30);
		
		this.productArray[2] = new Product();
		this.productArray[2].setName("에스프레소");
		this.productArray[2].setPrice(1500);
		this.productArray[2].setQuantity(10);
		
		this.balance = balance; // 초기값 설정 가능
	}
	
	// get
	public Product[] getProductArray() {
		return this.productArray;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	/**
	 * 돈을 넣는다
	 * @param customer 돈을 넣은 고객
	 * @param productName 구매할 제품의 이름(아메리카노, 카페라떼, 에스프레소)
	 */
	public void insertMeney(Customer customer, String productName) {
		
		// this.productArray를 반복하면서 Product 인스턴스의 제품명 확인
		// Product 인스턴스의 제품명과 productName이 같으면,
		// 해당 제품의 가격으로 자판기의 돈을 증가시키고
		// 고객의 돈을 감소시킨다.		
		for(Product product : this.productArray) {
			if(product.getName().equals(productName)) {
				this.balance += product.getPrice();
				customer.pay(product.getPrice());
				break; // 반복중단
			}
		}
	} 
	
	/**
	 * 버튼을 누른다
	 * @param customer
	 * @param productName 구매할 제품의 이름(아메리카노, 카페라떼, 에스프레소)
	 */
	public void pressButton(Customer customer, String productName) {
		this.pressButton(customer,productName , VendingMachine.PRODUCT_COUNT);
	}
	
	// 메서드 오버로딩
	public void pressButton(Customer customer, String productName, int orderCount) {
		
		// this.productArray를 반복하면서 productName과 같은지 비교한다.
		// 같으면 해당 제품의 수량을 체크하고 (0보다 작은지)
		// 작다면, 메서드를 종료시킨다.
		// 그렇지 않다면 해당 제품의 수량을 하나 감소시키고
		// 고객에게 해당 제품을 전달한다.
		for(Product product : this.productArray) {
			if(product.getName().equals(productName)) {
				if(product.getQuantity() <= 0) {
					return; // 메소드 종료
				}
				System.out.println(product.getName() + "(" + orderCount + ")" + "을 선택하셨습니다.");
				int quantity = product.getQuantity();
				quantity -= orderCount;
				product.setQuantity(quantity);
				
				customer.addStock(productName, product.getPrice(), orderCount);
			}
		}
	}
	
	// 자판기 목록 출력
	public void printProducts() {
		System.out.println("자판기 잔액: " + this.balance);
		for(Product product : this.productArray) {
			if( product != null)
			System.out.println("자판기 상품명: " + product.getName() 
							+ " | 자판기 상품수량: " + product.getQuantity());
		}
	}
}
