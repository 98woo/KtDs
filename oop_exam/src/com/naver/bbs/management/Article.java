package com.naver.bbs.management;

import com.naver.member.management.Member;

public class Article {
	public static void main(String[] args) {
		
		// Member : member.management package에 존재
		Member member = new Member("ID", "관리자");
		System.out.println(member);
		// 접근제어자 문제!(default -> public) 
		System.out.println(member.getId());
		System.out.println(member.getName());
		
	}
}
