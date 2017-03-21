package com.example.sample1;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.service.Operator;
import com.example.service.ProductService;

public class App2 {
	public static void main(String[] args) {

		String resources = "classpath:/com/example/sample1/bean.xml";
		
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);
		
		Operator service = container.getBean("operator", Operator.class);
		
		service.divide(10, 0);
	}
}
