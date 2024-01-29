package ref08_vending_machine_interface;

/**
 * 환불기능이 있는 자판기
 */
// 문제점1. VendingMachine과 코드 중복 -> extends VendingMachine
// 문제점2. public void refund : 외부에서 호출 가능 -> interface에서 제거
public class RefundableVendingMachine extends VendingMachine implements Sellable {
	
//	private Product[] productArray; 
//	private int balance;
//	
	// 생성자
	public RefundableVendingMachine() {
		super(200_000);
	}
	
	public RefundableVendingMachine(int balance) {
		super(balance);
	}
	
	@Override
	protected void refund(Customer customer, int refundMoney) {
		System.out.println("재고가 없네요.");
		System.out.println(refundMoney + "원 환불 해드릴게요.");
		
		// 1. 자판기의 금액을 환불해줄 금액만큼 감소시킨다
		super.setBalance(super.getBalance() - refundMoney);
		// 2. 고객에게 환불해준다
		customer.addMoney(refundMoney);
	}

	
//	@Override
//	public Product[] getProductArray() {
//		return this.productArray;
//	}
//
//	@Override
//	public int getBalance() {
//		return this.balance;
//	}
//
//	@Override
//	public void setBalance(int money) {
//		this.balance = money;
//	}
//
//	@Override
//	public void insertMeney(Customer customer, String productName) {
//		for(Product product : this.productArray) {
//			if(product.equals(productName)) {
//				this.balance += product.getPrice();
//				customer.pay(product.getPrice());
//				break; // 반복중단
//			}
//		}
//	}
//
//	@Override
//	public void pressButton(Customer customer, String productName) {
//		this.pressButton(customer,productName , VendingMachine.PRODUCT_COUNT);
//	}
//
//	@Override
//	public void pressButton(Customer customer, String productName, int orderCount) {
//		for(Product product : this.productArray) {
//			if(product.equals(productName)) {
//				
//				if(product.getQuantity() <= 0 || product.getQuantity() < orderCount) {
//					this.refund(customer, product.getPrice());
//					return; // 메소드 종료
//				}
//				System.out.println(product.getName() + "(" + orderCount + ")" + "을 선택하셨습니다.");
//				
//				int quantity = product.getQuantity();
//				quantity -= orderCount;
//				product.setQuantity(quantity);
//				
//				customer.addStock(productName, product.getPrice(), orderCount);
//				break; // 무의미한 반복 종료(time loss 방지)
//			}
//		}
//	}
//	@Override
//	public void printProducts() {
//		System.out.println("자판기 잔액: " + this.balance);
//		for(Product product : this.productArray) {
//			if( product != null)
//			System.out.println("자판기 상품명: " + product.getName() 
//							+ " | 자판기 상품수량: " + product.getQuantity());
//		}
//	}
}
