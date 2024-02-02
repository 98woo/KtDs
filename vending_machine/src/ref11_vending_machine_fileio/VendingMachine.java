package ref11_vending_machine_fileio;

import java.util.List;

import constants.AppendType;
import ref11_vending_machine_fileio.util.NIOFileUtil;

/**
 * <b>환불 불가능한 자판기</b>
 */
// 제네릭을 쓰는 의미가 없음 -> 추상화가 필요하다(인터페이스 사용)
//public class VendingMachine<I extends Product> implements Sellable<I>{
public class VendingMachine<I> implements Sellable<I> {
	
	private InsertMoneyHandler<I> insertMoneyHandler;
	private PressButtonHandler<I> pressButtonHandler;
	private PrintHandler<I> printHandler;
	
	// 멤버변수
	// Object[] 사용 x -> 인스턴스가 가진 기능을 써야함
	// balance = money 
	private List<I> productArray; 
	private int balance;
	
	// 생성자
	public VendingMachine(List<I> itemArray) {
//		this(100_000, null); // 상품이 없는 자판기 생성 (파라미터 없음)
		this(100_000, itemArray);
	}
	
	public VendingMachine(int balance, List<I> itemArray) {
		this.balance = balance;
		System.out.println("[ Coffee Machine ]");
		// I라는 클래스의 배열을 만들겠다. -> 사용 x
		// 생성자에서 배열을 초기화 할 수 없음.
		// 파라미터로 받아와서 할당해주자
		// this.productArray = new I[3];
		this.productArray = itemArray;
		
//		파라미터로 전달 받아야 하는 코드 -> Mart로 이동
//		this.productArray[0] = new Product();
//		this.productArray[0].setName("아메리카노");
//		this.productArray[0].setPrice(1000);
//		this.productArray[0].setQuantity(50);
	}

	@Override
	public List<I> getProductArray() {
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
	public void addProduct(String productName, int price, int quantity) {
		String description = String.join(",", productName, price + "", quantity + "");
//		FileUtil.writeFile("C:\\Java Exam", "goods.csv", description, true);
		NIOFileUtil.writeFile("C:\\Java Exam", "goods.csv", description, AppendType.APPEND);
	}

	@Override
	public void setInsertMoneyHandler(InsertMoneyHandler<I> handler) {
		this.insertMoneyHandler = handler;
	}

	@Override
	public void setPressButtonHandler(PressButtonHandler<I> handler) {
		this.pressButtonHandler = handler;
	}

	@Override
	public void setPrintHandler(PrintHandler<I> handler) {
		this.printHandler = handler;
	}

	@Override
	public void insertMeney(Customer customer, String productName) {
		// I[]인 productArray를 Product로 받으려고 해서 오류
		// I로 수정 -> I에 무슨 타입을 받을지 모름 ㅠ -> 제일 좋은 방법 : 인터페이스 사용
		for(I product : this.productArray) {
			// 여기 왔을 때 F6 누르면 메서드 타고타고~
			this.insertMoneyHandler.handle(this, customer, product, productName);
		}
	}

	@Override
	public void pressButton(Customer customer, String productName) {
		this.pressButton(customer,productName , VendingMachine.PRODUCT_COUNT);
	}

	@Override
	public void pressButton(Customer customer, String productName, int orderCount) {
		for(I product : this.productArray) {
			this.pressButtonHandler.handle(this, customer, product, productName, orderCount);
		}
	}

	// RefundableVendingMachine에서 상속 가능
	protected void refund(Customer customer, int refundMoney) {
		System.out.println("재고가 없네요.");
		System.out.println("환불은 불가능합니다.");
	}

	@Override
	public void printProducts() {
		for(I product : this.productArray) {
			if( product != null)
				this.printHandler.handle(product);
		}
	}
}
