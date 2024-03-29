package ref11_vending_machine_fileio.handlers;

import ref11_vending_machine_fileio.customers.Customer;
import ref11_vending_machine_fileio.machines.VendingMachine;

public interface PressButtonHandler<I> {
//	if(product.equals(productName)) {
//		
//		if(product.getQuantity() <= 0 || product.getQuantity() < orderCount) {
//			this.refund(customer, product.getPrice());
//			return; // 메소드 종료
//		}
//		System.out.println(product.getName() + "(" + orderCount + ")" + "을 선택하셨습니다.");
//		
//		int quantity = product.getQuantity();
//		quantity -= orderCount;
//		product.setQuantity(quantity);
//		
//		customer.addStock(productName, product.getPrice(), orderCount);
//		break;
//	}
	public void handle(VendingMachine<I> machine, Customer customer, 
						I item, String productName, int orderCount);
	

}
