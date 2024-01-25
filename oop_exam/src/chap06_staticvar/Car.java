package chap06_staticvar;

public class Car {
	
	/**
	 * 인스턴스를 만든 개수
	 */
	
	public static int instanceCount = 0;
	
	private String name;
	
	public Car(String name) {
		Car.instanceCount += 1;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
