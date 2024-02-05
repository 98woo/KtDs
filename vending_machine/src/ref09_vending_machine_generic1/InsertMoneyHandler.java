package ref09_vending_machine_generic1;

public interface InsertMoneyHandler<I> {

//		if(product.equals(productName)) {
//			this.balance += product.getPrice();
//			customer.pay(product.getPrice());
//			break;
//		}
	public void handle(VendingMachine<I> machine,Customer customer, 
						I item, String productName);
}
