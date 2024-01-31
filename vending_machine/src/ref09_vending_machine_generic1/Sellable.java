package ref09_vending_machine_generic1;

// 인터페이스를 구현하는 클래스가 있을 경우,
// 인터페이스에서부터 제네릭을 적용시켜야한다.
/**
 * <I extends Product> ==> Product 클래스를 상속한 타입만 가능 (X)
 * 					   ==> Product 클래스를 상속한 타입 혹은
 *                         Product 인터페이스를 구현한 타입 (O)
 * @param <I>
 */
// 제네릭을 사용하는 의미가 없는 방법
//public interface Sellable<I extends Product> {
public interface Sellable<I> {
	
	public int PRODUCT_COUNT = 1;
	public String MACHINE_NAME = "자판기";
	
	// Product 사용 필수 -> 결합도가 높은 코드
	// public Product[] getProductArray();
	public I[] getProductArray();
	
	public int getBalance();
	
	public void setBalance(int money);
	
	// 제네릭 사용으로 인한 VendingMachine 추상화
	public void setInsertMoneyHandler(InsertMoneyHandler<I> handler);
	
	public void setPressButtonHandler(PressButtonHandler<I> handler);
	
	public void setPrintHandler(PrintHandler<I> handler);
	
	// 돈을 넣는다
	public void insertMeney(Customer customer, String productName);
	
	// 버튼을 누른다
	public void pressButton(Customer customer, String productName);
	
	// 메서드 오버로딩
	public void pressButton(Customer customer, String productName, int orderCount);

	// 자판기 목록 출력
	public void printProducts();

}
