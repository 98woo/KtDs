package ref11_vending_machine_fileio.inf;

import java.util.List;

import ref01_vending_machine.Customer;
import ref09_vending_machine_generic1.PrintHandler;
import ref11_vending_machine_fileio.handlers.InsertMoneyHandler;
import ref11_vending_machine_fileio.handlers.PressButtonHandler;

// 
public interface Sellable<I> {
	
	public int PRODUCT_COUNT = 1;
	public String MACHINE_NAME = "자판기";
	
	public List<I> getProductArray();
	
	public int getBalance();
	
	public void setBalance(int money);
	
	// 제네릭 사용으로 인한 VendingMachine 추상화
	public void setInsertMoneyHandler(InsertMoneyHandler<I> handler);
	
	public void setPressButtonHandler(PressButtonHandler<I> handler);
	
	public void setPrintHandler(PrintHandler<I> handler);
	
	// 상품 추가
	public void addProduct(String productName, int price, int quantity);
	
	// 돈을 넣는다
	public void insertMeney(Customer customer, String productName);
	
	// 버튼을 누른다
	public void pressButton(Customer customer, String productName);
	
	// 메서드 오버로딩
	public void pressButton(Customer customer, String productName, int orderCount);

	// 자판기 목록 출력
	public void printProducts();

}
