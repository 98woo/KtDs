package ref09_vending_machine_generic1;

public class Mart {
	
	public static void main(String[] args) {

		Product[] productArray = new Product[3];
		
		productArray[0] = new Product();
		productArray[0].setName("아메리카노");
		productArray[0].setPrice(1000);
		productArray[0].setQuantity(50);
		
		productArray[1] = new Product();
		productArray[1].setName("카페라떼");
		productArray[1].setPrice(2000);
		productArray[1].setQuantity(30);
		
		productArray[2] = new Product();
		productArray[2].setName("에스프레소");
		productArray[2].setPrice(1500);
		productArray[2].setQuantity(20);
		
		Sellable<Product> machine = new VendingMachine<>(100_000, productArray);
		
		// 익명클래스 사용
		// 안드로이드, ios 개발방법, 스트링부트 -> App의 유연함을 위해서
		machine.setInsertMoneyHandler(new InsertMoneyHandler<Product>() {
			
			@Override
			public void handle(VendingMachine<Product> machine, Customer customer, 
								Product item, String productName) {
				if(item.equals(productName)) {
					
					int balance = machine.getBalance();
					balance += item.getPrice();
					machine.setBalance(balance);
					
					customer.pay(item.getPrice());
				}
			}
		});
		
		machine.setPressButtonHandler(new PressButtonHandler<Product>() {
			
			@Override
			public void handle(VendingMachine<Product> machine, Customer customer, 
								Product item, String productName, int orderCount) {
				if(item.equals(productName)) {
				
					if(item.getQuantity() <= 0 || item.getQuantity() < orderCount) {
						machine.refund(customer, item.getPrice());
						return; // 메소드 종료
					}
					System.out.println(item.getName() + "(" + orderCount + ")" + "을 선택하셨습니다.");
					
					int quantity = item.getQuantity();
					quantity -= orderCount;
					item.setQuantity(quantity);
					
					customer.addStock(productName, item.getPrice(), orderCount);
				}
			}
		});
		
		machine.setPrintHandler(new PrintHandler<Product>() {
			
			@Override
			public void handle(Product item) {
				System.out.println("자판기 상품명: " + item.getName() 
				+ " | 자판기 상품수량: " + item.getQuantity());
			}
		});
		
		Customer customer = new Customer(200_000);
		
		machine.insertMeney(customer, "아메리카노");
		machine.pressButton(customer, "아메리카노", 50);
		
		machine.insertMeney(customer, "아메리카노");
		machine.pressButton(customer, "아메리카노", 1); 
		
		machine.printProducts();
		customer.printProduct();
		
		System.out.println("=================================");
		
		// 오버로딩
		Sellable<Product> coffeeMachine = new RefundableVendingMachine<>(400, productArray);
		
		coffeeMachine.setInsertMoneyHandler(new InsertMoneyHandler<Product>() {
			
			@Override
			public void handle(VendingMachine<Product> machine, Customer customer, 
								Product item, String productName) {
				if(item.equals(productName)) {
					
					int balance = machine.getBalance();
					balance += item.getPrice();
					machine.setBalance(balance);
					
					customer.pay(item.getPrice());
				}
			}
		});
		
		coffeeMachine.setPressButtonHandler(new PressButtonHandler<Product>() {
			
			@Override
			public void handle(VendingMachine<Product> machine, Customer customer, 
								Product item, String productName, int orderCount) {
				if(item.equals(productName)) {
				
					if(item.getQuantity() <= 0 || item.getQuantity() < orderCount) {
						machine.refund(customer, item.getPrice());
						return; // 메소드 종료
					}
					System.out.println(item.getName() + "(" + orderCount + ")" + "을 선택하셨습니다.");
					
					int quantity = item.getQuantity();
					quantity -= orderCount;
					item.setQuantity(quantity);
					
					customer.addStock(productName, item.getPrice(), orderCount);
				}
			}
		});
		
		coffeeMachine.setPrintHandler(new PrintHandler<Product>() {
			
			@Override
			public void handle(Product item) {
				System.out.println("자판기 상품명: " + item.getName() 
				+ " | 자판기 상품수량: " + item.getQuantity());
			}
		});
		
		coffeeMachine.insertMeney(customer, "카페라떼");
		coffeeMachine.pressButton(customer,"카페라떼", 30);
		
		coffeeMachine.insertMeney(customer, "카페라떼");
		coffeeMachine.pressButton(customer,"카페라떼", 1);
		
		coffeeMachine.printProducts();
		customer.printProduct();
		
	}
}
