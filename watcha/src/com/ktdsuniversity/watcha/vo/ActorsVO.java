package com.ktdsuniversity.watcha.vo;

import java.util.List;

public class ActorsVO {

	// Producing은 연결을 역할만 수행한다. FK만 존재
	// cast는 Producing과 다르게 일반컬럼이 존재한다.
	
	private String actorId;
	private String profile;
	private String name;
	
	// 자바는 1:N 관계를 사용할 수 있어서 MoviesVO를 써도 되지만 castsVO의 배역과 주연여부를 알아야 하기 때문에 castsVO 사용
	// 자바는 두테이블을 연결만 해주는 테이블은 무시하고 두 테이블을 직접 연결한다. 
	// A - B - C B테이블이 해소 테이블이라면 (pk와 fk만 존재한다면 )
	// A Has a List<B>
	// B Has a List<A> 가 성립된다. 
	private List<CastsVO> casts;
	
	public List<CastsVO> getCasts() {
		return casts;
	}
	public void setCasts(List<CastsVO> casts) {
		this.casts = casts;
	}
	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}
