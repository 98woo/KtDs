package ref07_vending_machine_abstract;

/**
 * 자판기의 추상 클래스
 * abstract method가 있을 경우, 클래스의 타입도 abstract가 되어야한다.
 * abstract class는 인스턴스로 만들 수 없다. (new Seller() -> X)
 * (추상메서드는 바디가 없기(구현x) 때문에, 인스턴스에서 어떻게 동작하는 메서드인지 알 수 없음)
 */
public abstract class Seller {
	
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
	public Seller() {
		this(100_000);
	}
	
	public Seller(int balance) {
		System.out.println("[ Coffee Machine ]");
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
		this.productArray[2].setQuantity(20);
		
		this.balance = balance; // 초기값 설정 가능
	}
	
	// get
	public Product[] getProductArray() {
		return this.productArray;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int money) {
		this.balance = money;
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
			if(product.equals(productName)) {
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
		
		for(Product product : this.productArray) {
			if(product.equals(productName)) {
				
				if(product.getQuantity() <= 0 || product.getQuantity() < orderCount) {
					// 환불기능
					// refund() : 구현되지는 않았지만 호출은 가능
					// -> VendingMachine, RefundableVedingMachine에서 상속받아 기능 구현
					this.refund(customer, product.getPrice());
					return; // 메소드 종료
				}
				System.out.println(product.getName() + "(" + orderCount + ")" + "을 선택하셨습니다.");
				
				int quantity = product.getQuantity();
				quantity -= orderCount;
				product.setQuantity(quantity);
				
				customer.addStock(productName, product.getPrice(), orderCount);
				break; // 무의미한 반복 종료(time loss 방지)
			}
		}
	}
	
	// 추상 - 사상
	/**
	 * 고객에게 환불처리 한다
	 * 상속된 클래스에서만 사용할 수 있도록 한다
	 * @param customer 환불 받을 고객
	 * @param refundMoney 환불 받을 금액
	 */
	protected abstract void refund(Customer customer, int refundMoney);
	
	
	// 자판기 목록 출력 ->  toString()을 오버라이딩해서 사용해도 됨
	public void printProducts() {
		System.out.println("자판기 잔액: " + this.balance);
		for(Product product : this.productArray) {
			if( product != null)
			System.out.println("자판기 상품명: " + product.getName() 
							+ " | 자판기 상품수량: " + product.getQuantity());
		}
	}
}
