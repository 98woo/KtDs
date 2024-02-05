package ref08_vending_machine_interface;

/**
 * <b>환불 불가능한 자판기</b>
 */
public class VendingMachine implements Sellable{
	
	// 멤버변수
	private Product[] productArray; 
	private int balance;
	
	// 생성자
	public VendingMachine() {
		this(100_000);
	}
	
	public VendingMachine(int balance) {
		this.balance = balance;
		
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
	}

	@Override
	public Product[] getProductArray() {
		return this.productArray;
	}

	@Override
	public int getBalance() {
		return this.balance;
	}

	@Override
	public void setBalance(int money) {
		this.balance = money;
	}

	@Override
	public void insertMeney(Customer customer, String productName) {
		for(Product product : this.productArray) {
			if(product.equals(productName)) {
				this.balance += product.getPrice();
				customer.pay(product.getPrice());
				break; // 반복중단
			}
		}
	}

	@Override
	public void pressButton(Customer customer, String productName) {
		this.pressButton(customer,productName , VendingMachine.PRODUCT_COUNT);
	}

	@Override
	public void pressButton(Customer customer, String productName, int orderCount) {
		for(Product product : this.productArray) {
			if(product.equals(productName)) {
				
				if(product.getQuantity() <= 0 || product.getQuantity() < orderCount) {
					this.refund(customer, product.getPrice());
					return; // 메소드 종료
				}
				System.out.println(product.getName() + "(" + orderCount + ")" + "을 선택하셨습니다.");
				
				int quantity = product.getQuantity();
				quantity -= orderCount;
				product.setQuantity(quantity);
				
				customer.addStock(productName, product.getPrice(), orderCount);
				break;
			}
		}
	}

	// RefundableVendingMachine에서 상속 가능
	protected void refund(Customer customer, int refundMoney) {
		System.out.println("재고가 없네요.");
		System.out.println("환불은 불가능합니다.");
	}

	@Override
	public void printProducts() {
		for(Product product : this.productArray) {
			if( product != null)
			System.out.println("자판기 상품명: " + product.getName() 
							+ " | 자판기 상품수량: " + product.getQuantity());
		}
	}
}
