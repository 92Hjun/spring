package com.example.sample6;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		String resources ="classpath:/com/example/sample6/bean.xml";
		
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);
		
		EmailService service = container.getBean("emailService", EmailService.class);
		
		service.connect();
	}
}
