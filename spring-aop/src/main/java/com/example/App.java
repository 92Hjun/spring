package com.example;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		String resources="classpath:/com/example/bean.xml";
		
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);
		
		MemberService service = container.getBean("service",MemberService.class);
		
		System.out.println(service);
		service.addNewMember("홍길동");
		service.deleteAllMember();
		
	}
}
