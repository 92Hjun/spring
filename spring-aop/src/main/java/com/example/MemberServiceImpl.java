package com.example;

public class MemberServiceImpl implements MemberService{
	
	@Override
	public void addNewMember(String name) {
		// 핵심기능 구현... db에 member를 저장
		System.out.println(name+" 고객 저장완료  / 핵심기능");
		
	}
	@Override
	public void deleteAllMember() {
		// 핵심기능 구현... db에 member를 삭제
		System.out.println("사용자 정보 삭제 완료 / 핵심기능");
		
	}
}
