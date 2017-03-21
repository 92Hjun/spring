package com.examaple.aop.sample2;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.service.AdminService;
import com.example.vo.Role;

public class App {
	public static void main(String[] args) {
		// classpath 프로젝트및 해당 라이브러리 내에서 찾겠다.
		/*String resources = "classpath:/com/examaple/aop/sample2/bean.xml";
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);*/
		
		String resources = "classpath:/com/examaple/aop/sample2/bean.xml";
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);
		
		
		AdminService op = container.getBean("adminService", AdminService.class);
		
		/*
		int result1 = op.plus(1, 2);
		int retult2 = op.divide(10, 0);
		*/
		
		op.deleteUser("hong", new Role("이순신", "ADMIN"));
		op.deleteUser("hong", new Role("김유신", "USER"));
		
	}
}
