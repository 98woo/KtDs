package chap11_inheritance;

public class SportCar extends Vehicle {
	
	public SportCar(String name) {
		super(name);
	}
	
	public void turboMode() {
		System.out.println(this.getName() + "을(를) 터보모드로 전환되었습니다.");
	}

}
