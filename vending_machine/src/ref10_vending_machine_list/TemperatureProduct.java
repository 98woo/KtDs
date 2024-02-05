package ref10_vending_machine_list;

public class TemperatureProduct extends Product {

	/**
	 * 상품이 뜨거운지 차가운지에 대한 정보
	 * true : 따뜻
	 * false : 차갑
	 */
	private boolean isHot;
	
	public boolean getIsHot() {
		return this.isHot;
	}
	
	public void setIsHot(boolean isHot) {
		this.isHot = isHot;
	}
}
