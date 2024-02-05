package ref08_vending_machine_interface;

public interface Sellable {
	
	// interface에서 상수를 정의할 때, 
	// static final은 자동으로 적용되므로 생략한다.
	// public static final int PRODUCT_COUNT = 1;
	// public static final String MACHINE_NAME = "자판기";
	public int PRODUCT_COUNT = 1;
	public String MACHINE_NAME = "자판기";
	

	public Product[] getProductArray();
	
	public int getBalance();
	
	public void setBalance(int money);
	
	// 돈을 넣는다
	public void insertMeney(Customer customer, String productName);
	
	// 버튼을 누른다
	public void pressButton(Customer customer, String productName);
	
	// 메서드 오버로딩
	public void pressButton(Customer customer, String productName, int orderCount);

	// 환불
	// public void refund(Customer customer, int refundMoney);
	
	// 자판기 목록 출력
	public void printProducts();

}
