package chap11_inheritance;

public class VehicleMain {
	
	public static void main(String[] args) {
		
		EV ev = new EV("전기자동차", 100);
		SportCar sportCar = new SportCar("스포츠카");
		BatMobile batMobile = new BatMobile("배트모빌");
				
//		ev.setName("전기자동차");
//		ev.setBattery(100);
//		sportCar.setName("스포츠카");
//		batMobile.setName("배트모빌");
		
		ev.startEngine();
		ev.batteryCheck();
		
		System.out.println("------------------------");
		
		sportCar.startEngine();
		sportCar.turboMode();
		
		System.out.println("------------------------");
		
		batMobile.startEngine();
		batMobile.turboMode();
		batMobile.batPort();
		
		System.out.println("========================");
		
		// 부모타입으로 생성하기
		Vehicle carEV = new EV("토르", 1000);
		Vehicle carSport = new SportCar("람보르기니");
		Vehicle carBat = new BatMobile("배트카");

		carEV.startEngine();
//		carEV.batteryCheck(); // 컴파일에러 : The method is undefined for the type Vehicle
		
		System.out.println("------------------------");
		
		carSport.startEngine();
//		carSport.turboMode(); // 컴파일에러 : The method is undefined for the type Vehicle
		
		System.out.println("------------------------");
		
		carBat.startEngine();
//		carBat.turboMode(); // 컴파일에러 : The method is undefined for the type Vehicle
//		carBat.batPort(); // 컴파일에러 : The method is undefined for the type Vehicle
	}

}
