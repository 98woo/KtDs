package com.ktdsuniversity.terranunit;

public class Game {
	
	public static void move(Attackable unit) {
		unit.attack();
		unit.move();
		unit.stop();
		unit.patrol();
		
		// 잘못된 호출 방법
		// Scv s = new Unit();
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
		
		// 익명클래스
		// 한번 쓰고 안쓸 클래스를 쉽게 만드는 방법
		// Stream API(함수형 자바)를 사용할 때 주로 사용되는 방법.
		Mineable drone = new Mineable() {
			
			@Override
			public void mining() {
				System.out.println("드론이 미네랄을 채굴합니다.");
			}
		};
		
		drone.mining();
		
		SpecialCommand marine = new Marine(); // 인터페이스 name = new Class();
		Attackable scv = new Scv();

		marine.attack();
		marine.steampack();
		marine.move();
		
		scv.attack();
		scv.move();
		scv.patrol();

		// scv의 메서드 mining() 사용불가 -> 인터페이스가 제공하지 않는 기능을 사용
		// scv.mining();
		System.out.println("-------------------");

		
		move(scv);
		System.out.println("-------------------");
		move(marine);
	}
}
