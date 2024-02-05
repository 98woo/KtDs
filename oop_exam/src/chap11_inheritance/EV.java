package chap11_inheritance;

public class EV extends Vehicle{
	
	private int battery;
	
	public EV(String name, int battery) {
		super(name);
		this.battery = battery;
	}
	
	public int getBattery() {
		return battery;
	}
	
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public void batteryCheck() {
		System.out.println(this.getName() + "의 배터리량: " + this.getBattery());
	}
}
