package com.ktdsuniversity.terranunit;

public class Scv implements Attackable, Mineable{
	
	@Override
	public void mining() {
		System.out.println("자원을 캡니다.");
	}

	@Override
	public void move() {
		System.out.println("이동");		
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}

	@Override
	public void hold() {
		System.out.println("홀드");
	}

	@Override
	public void patrol() {
		System.out.println("정찰");
	}

	@Override
	public void attack() {
		System.out.println("공격");
	}

	
}
