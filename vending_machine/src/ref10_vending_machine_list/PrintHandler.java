package ref10_vending_machine_list;

public interface PrintHandler<I> {

//		System.out.println("자판기 상품명: " + product.getName() 
//						+ " | 자판기 상품수량: " + product.getQuantity());
	
	public void handle(I item);
	
	
}
