package chap11_inheritance;

public class BatMobile extends SportCar {
	
	public BatMobile(String name) {
		super(name);
	}
	
	public void batPort() {
		System.out.println(this.getName() + "의 배트포트를 분리했습니다.");
	}

}
