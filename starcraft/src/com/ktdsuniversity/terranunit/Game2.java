package com.ktdsuniversity.terranunit;

public class Game2 {
	
	public static void move(Attackable unit) {
		unit.attack();
		unit.move();
		unit.stop();
		unit.patrol();
		
		// 잘못된 호출 방법
//		if(unit instanceof Scv) {
//			Scv scv = (Scv) unit;
//			scv.mining();
//		}
		if(unit instanceof Mineable) {
			Mineable worker = (Mineable) unit;
			worker.mining();
		}
	}
	
	public static void main(String[] args) {
		
		SpecialCommand marine = new Marine(); // 인터페이스 name = new Class();
		Attackable scv = new Scv();
		
		// 잘못된 상속
		Scv scv2 = new Scv();
		// marine --> SpecialCommand
		SpecialCommand scv3 = new Scv2();
		
		marine.attack();
		marine.steampack();
		marine.move();
		
		scv.attack();
		scv.move();
		scv.patrol();
		
		// 잘못된 상속
		// Attackable 인터페이스에는 steampack()이 없음
		// scv.steampack();
		scv3.steampack();
		
		// scv의 메서드 mining() 사용불가 -> 인터페이스가 제공하지 않는 기능을 사용
		// scv.mining();
		System.out.println("-------------------");

		
		move(scv);
		System.out.println("-------------------");
		move(marine);
	}
}
