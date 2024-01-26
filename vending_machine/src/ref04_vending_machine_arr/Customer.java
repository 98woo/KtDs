package ref04_vending_machine_arr;

public class Customer {

	private int wallet;
	// private Product product;
	// Product 배열 사용
	private Product[] productArray;
	
	//생성자
	public Customer(int wallet) {
		this.wallet = wallet;
		this.productArray = new Product[3];
	}
	
	// get
	public int getWallet() {
		return this.wallet;
	}
	
	public Product[] getProduct() {
		return this.productArray;
	}
	
	// 메서드
	public void pay(int price) {
		if(this.wallet < price) {
			System.out.println("잔액이 부족합니다.");
		}
		this.wallet -= price;
	}
	

	public void addStock(String name, int price, int productCount) {
		
		// 고객이 방금 구매한 제품이 고객의 제품목록(this.prodctArray)에 있는지 확인한다.
		// 있다면, productCount만큼 수량만 증가시킨다
		// 없다면, 비어있는 인덱스를 찾아서 새롭게 할당해 준다.
		boolean hasProduct = false;
		int i = 0;
		int nullIndex = -1;
		
		for(i = 0; i < this.productArray.length; i++) {			
			// 구매 이력 검증
			// for문을 순회하는 중 this.productArray[i]가 null 일 때, 
			// NullPointerException 발생할 수 있음! -> null 체크해줘야함!
			if(this.productArray[i] != null && this.productArray[i].getName().equals(name)) {
				hasProduct = true;
				break;
			}
			
			// 구매 이력이 없다면 for문을 전부 순회하고 i가 3번이 되어버림!!!
			// 따라서, null인 메모리 공간을 찾아서 그 공간의 인덱스를 찾아야함!
			// (nullIndex == -1) 조건이 없다면 마지막의 null인 공간을 가져오게 됨
			// 첫번째 null인 메모리의 인덱스를 가져오기 위해서 조건 추가!
			if(this.productArray[i] == null && nullIndex == -1) {
				nullIndex = i;
			}
		}
		// 구매 이력 있을때 -> 수량 증가
		if(hasProduct) {
			Product product = this.productArray[i];
			int quantity = product.getQuantity();
			quantity += productCount;
			product.setQuantity(productCount);
			
		// 구매 이력 없을때 -> 상품 생성
		// 구매 이력이 없다면 for문을 전부 순회하고 i가 3번이 되어버림!!!
		// 따라서, null 인덱스를 찾아서!
		// 그 공간에 새로운 제품을 할당해주어야함
		} else {
			this.productArray[nullIndex] = new Product();
			this.productArray[nullIndex].setName(name);
			this.productArray[nullIndex].setPrice(price);
			this.productArray[nullIndex].setQuantity(productCount);
		}
	}
	
	public void printProduct() {
		
		System.out.println("고객 잔액: " + this.wallet);
		
		for(Product product : this.productArray) {
			if( product != null) {
				System.out.println("고객 상품 이름: " + product.getName() 
								+ " | 고객 상품 수량: " + product.getQuantity());
			}
		}

	}
}