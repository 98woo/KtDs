package chap11_inheritance;

public class Vehicle {
	
	private String name;
	
	// 부모클래스에 파라미터가 있는 생성자만 있을 경우,
	// 자식클래스에서 부모클래스의 생성자를 반드시 호출해야함
	public Vehicle(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void startEngine() {
		System.out.println(this.getName() + "에 시동을 걸었습니다.");
	}

}
