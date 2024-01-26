package ref01_drink_machine_arr;

public class Drink {
	
	/**
	 * 상품명
	 */
	String name;
	/**
	 * 가격
	 */
	int price;
	/**
	 * 재고
	 */
	int stock;
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
