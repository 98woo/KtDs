package ref11_vending_machine_fileio.handlers;

import ref11_vending_machine_fileio.customers.Customer;
import ref11_vending_machine_fileio.machines.VendingMachine;

public interface InsertMoneyHandler<I> {

//		if(product.equals(productName)) {
//			this.balance += product.getPrice();
//			customer.pay(product.getPrice());
//			break;	
//		}
	public void handle(VendingMachine<I> machine,Customer customer, 
						I item, String productName);
}
