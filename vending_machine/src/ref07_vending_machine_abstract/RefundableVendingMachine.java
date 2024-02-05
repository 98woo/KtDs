package ref07_vending_machine_abstract;

/**
 * 환불기능이 있는 자판기
 */
public class RefundableVendingMachine extends Seller {
	
	// 생성자
	public RefundableVendingMachine() {
		super();
	}
	
	public RefundableVendingMachine(int money) {
		super(money);
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
}
