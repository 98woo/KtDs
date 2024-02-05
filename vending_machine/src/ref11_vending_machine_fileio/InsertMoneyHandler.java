package ref11_vending_machine_fileio;

public interface InsertMoneyHandler<I> {

//		if(product.equals(productName)) {
//			this.balance += product.getPrice();
//			customer.pay(product.getPrice());
//			break;
//		}
	public void handle(VendingMachine<I> machine,Customer customer, 
						I item, String productName);
}
