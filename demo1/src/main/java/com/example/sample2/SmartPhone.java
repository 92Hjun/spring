package com.example.sample2;

import org.springframework.stereotype.Component;

@Component("phone")
public class SmartPhone {
	
	public void call(){
		System.out.println("전화를 겁니다");
	}
	
	public void discount(){
		System.out.println("전화 연결을 합니다");
	}
	
}
