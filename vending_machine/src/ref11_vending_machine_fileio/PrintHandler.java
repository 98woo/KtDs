package ref11_vending_machine_fileio;

public interface PrintHandler<I> {

//		System.out.println("자판기 상품명: " + product.getName() 
//						+ " | 자판기 상품수량: " + product.getQuantity());
	
	public void handle(I item);
	
	
}
