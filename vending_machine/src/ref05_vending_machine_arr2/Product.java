package ref05_vending_machine_arr2;
/**
 * 데이터 클래스는 getter/setter를 제외하고 기능을 추가하지 않는다
 * 기능을 추가하게 되면, 데이터 클래스임을 알 수 없게 된다.
 */
public class Product {
	
	private String name;
	private int price;
	private int quantity;
	
	// Getter : private한 멤버변수값 반환
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	// Setter : private한 멤버변수에 값 대입
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
