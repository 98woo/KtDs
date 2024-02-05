package ref01_drink_machine_arr;

public class DrinkVendingMachine {


	Drink[] drinkArray = new Drink[4];
	
	public DrinkVendingMachine() {
		this.drinkArray[0] = new Drink();
		this.drinkArray[0].setName("박카스");
		this.drinkArray[0].setPrice(900);
		this.drinkArray[0].setStock(15);;
		          
		this.drinkArray[1] = new Drink();
		this.drinkArray[1].setName("몬스터");;
		this.drinkArray[1].setPrice(1500);
		this.drinkArray[1].setStock(20);;
		          
		this.drinkArray[2] = new Drink();
		this.drinkArray[2].setName("핫식스");;
		this.drinkArray[2].setPrice(1300);;
		this.drinkArray[2].setStock(10);;
		          
		this.drinkArray[3] = new Drink();
		this.drinkArray[3].setName("밀키스");
		this.drinkArray[3].setPrice(1400);;
		this.drinkArray[3].setStock(5);;
	}
	
	// 주문하기
	public void order(String name, int orderCount) {
		
		for(Drink drink : drinkArray) {
			if(drink.getName().equals(name)) {
				
				if(drink.getStock() < orderCount) {
					System.out.println("주문하실 수 없습니다.");
					break;
				}				
				int quantity = drink.getStock();
				quantity -= orderCount;
				drink.setStock(quantity);
				System.out.println(">> 주문결과: "+ drink.getName() 
										+ " | " + drink.getPrice() 
										+ " | " + drink.getStock());
				
				break;
			}
		}
	}
		
	// 입고
	public void fill(String name, int quantity) {
		
		for(Drink drink : drinkArray) {
			if(drink.getName().equals(name)) {
				drink.setStock((drink.getStock() + quantity)); 
			}
		}
	}
	
	public void printStock() {
		System.out.println("====================================");
		System.out.println("         자판기 재고 상황 출력            ");
		System.out.println("====================================");
		for(Drink drink : drinkArray) {
			System.out.println("상품명: " + drink.getName() +  
								" | 가격: " + drink.getPrice() + 
								" | 재고: " + drink.getStock());
		}
	}
	
}
