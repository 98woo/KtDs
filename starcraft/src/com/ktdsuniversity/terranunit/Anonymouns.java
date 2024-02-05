package com.ktdsuniversity.terranunit;

public class Anonymouns {
	
	public void startEngine(Rideable rideable) {
		rideable.startEngine();
	}

	public static void main(String[] args) {
		
		Anonymouns app = new Anonymouns();
		app.startEngine(new Rideable() {

			@Override
			public void startEngine() {
				System.out.println("일회용 인스턴스를 생성합니다.");
			}
		});
	}
}









