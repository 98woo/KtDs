package ref09_vending_machine_generic1;
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

	
	// 메서드 오버라이딩
	// Object 클래스에 있는 toString() 재정의
	@Override // Annotation
	public String toString() {
		
		String superStringResult = super.toString();
		System.out.println(superStringResult); // ref06_vending_machine_inheri.Product@279f2327
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("제품명: " + this.name);
		sb.append(" | 가격: " + this.price);
		sb.append(" | 재고: " + this.quantity);
		
		return sb.toString();
	}
	

	/*
	 * Product p = new Product();
	 * if ( p.equals("박카스") ) { ... }
	 * -> name을 비교하는 메서드에서 전부 getName() 제거 가능
	 */
	@Override
	public boolean equals(Object obj) {
	
		if( obj instanceof String ) {
			return this.name.equals( (String) obj);
		}
		
		return super.equals(obj);
	}

}
