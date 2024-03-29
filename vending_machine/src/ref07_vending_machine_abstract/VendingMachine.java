package ref07_vending_machine_abstract;

/**
 * 상속 받은 클래스가 추상 메소드가 존재하는 추상 클래스라면<br/>
 * 추상 메소드를 해당 클래스에서 구현을 시키거나<br/>
 * 해당 클래스도 추상 클래스로 만들어 주어야 한다.<br/>
 * <b>환불 불가능한 자판기</b>
 */
public class VendingMachine extends Seller{
	
	public VendingMachine() {
		super(); // 슈퍼클래스의 기본생성자 호출
	}
	
	public VendingMachine(int money) {
		super(money); // 슈퍼클래스의 int 파라미터가 있는 생성자를 호출
	}

	
	@Override
	public final void insertMeney(Customer customer, String productName) {
		super.insertMeney(customer, productName);
	}
	
	@Override
	public final void pressButton(Customer customer, String productName) {
		super.pressButton(customer, productName);
	}
	
	@Override
	public final void pressButton(Customer customer, String productName, int orderCount) {
		super.pressButton(customer, productName, orderCount);
	}
	

	@Override
	protected void refund(Customer customer, int refundMoney) {
		System.out.println("재고가 없습니다");
		System.out.println("환불은 못해드려요.");
	}
	
}
