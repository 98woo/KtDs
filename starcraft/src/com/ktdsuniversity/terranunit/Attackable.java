package com.ktdsuniversity.terranunit;

/**
 * 공격 가능한 유닛 인터페이스
 * 인터페이스는 인터페이스만 상속 가능
 */
public interface Attackable extends Unit {
	
	public void attack();

}
