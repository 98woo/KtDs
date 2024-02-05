package ref11_vending_machine_fileio;

import java.util.List;

import ref11_vending_machine_fileio.util.FileUtil;

public class Mart {
	
	// Method Refactoring
	public static List<Product> initiateProduct() {	
		// 파일을 DB처럼 사용
		// Application의 환경변수를 별도의 파일로 관리하고 싶을 때 사용
		List<Product> productList = FileUtil.readCSVFile("C:\\Java Exam", "goods.csv");	
		return productList;
	}
	
	public static void initiateInserMoneyHandler(Sellable<Product> sellable) {
		sellable.setInsertMoneyHandler(new InsertMoneyHandler<Product>() {
			
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
	}
	
	public static void initiatePressButtonHandler(Sellable<Product> sellable) {
		sellable.setPressButtonHandler(new PressButtonHandler<Product>() {
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
	}
	
	public static void initiatePrintHadler(Sellable<Product> sellable) {
		sellable.setPrintHandler(new PrintHandler<Product>() {
			@Override
			public void handle(Product item) {
				System.out.println("자판기 상품명: " + item.getName() 
				+ " | 자판기 상품수량: " + item.getQuantity());
			}
		});
	}
	
	public static void main(String[] args) {

		Sellable<Product> machine = new VendingMachine<>(100_000, initiateProduct());

		initiateInserMoneyHandler(machine);
		initiatePressButtonHandler(machine);
		initiatePrintHadler(machine);
		
		machine.addProduct("바닐라쉐이크", 6000, 20);
		
		Customer customer = new Customer(200_000);
		
		machine.insertMeney(customer, "아메리카노");
		machine.pressButton(customer, "아메리카노", 50);
		
		machine.insertMeney(customer, "바닐라라떼");
		machine.pressButton(customer, "바닐라라떼", 10); 
		
		machine.printProducts();
		customer.printProduct();
		
		System.out.println("=================================");
		
		// 오버로딩
		Sellable<Product> coffeeMachine = new RefundableVendingMachine<>(400, initiateProduct());
		
		initiateInserMoneyHandler(coffeeMachine);
		initiatePressButtonHandler(coffeeMachine);
		initiatePrintHadler(coffeeMachine);

		coffeeMachine.addProduct("커피쉐이크", 6000, 20);
		
		coffeeMachine.insertMeney(customer, "카페라떼");
		coffeeMachine.pressButton(customer,"카페라떼", 30);
		
		coffeeMachine.insertMeney(customer, "카페모카");
		coffeeMachine.pressButton(customer,"카페모카", 20);
		
		coffeeMachine.printProducts();
		customer.printProduct();
		
		

	}
}
