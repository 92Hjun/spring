package com.example.sample3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		String resources = "classpath:/com/example/sample3/bean.xml";
		
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);
		
		EventNotificationService service = container.getBean("eventService", EventNotificationService.class);
		OrderNotificationService service2 = container.getBean("order", OrderNotificationService.class);
		
		service.notice("ㅎㅇ");
		service2.notify("졸려 죽겠네");
	}
}