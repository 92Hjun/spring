package com.example.sample2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SmartApp {
	public static void main(String[] args) {
		String resources = "classpath:/com/example/sample2/bean.xml";
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);
		
		SmartTV tv = container.getBean("tv", SmartTV.class);
		SmartPhone phone = container.getBean("phone", SmartPhone.class);
		
		tv.display();
		tv.web();
		phone.call();
		phone.discount();
		
	}
}
