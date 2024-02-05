package ref01_drink_machine_arr;

public class DrinkVendingMachineMain {
	public static void main(String[] args) {
		
		DrinkVendingMachine vendingMachine = new DrinkVendingMachine();
		
		vendingMachine.printStock();
		
		vendingMachine.order("박카스", 5);
		vendingMachine.order("몬스터", 5);
		vendingMachine.order("밀키스", 5);
		
		vendingMachine.fill("박카스", 100);
		vendingMachine.fill("몬스터", 100);
		vendingMachine.fill("핫식스", 100);
		vendingMachine.fill("밀키스", 100);
		
		vendingMachine.printStock();
	}
}
