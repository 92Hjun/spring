package com.example.sample1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class OperatorApp2 {
	public static void main(String[] args) {
		/*
		
			String resourse = "classpath:/com/example/sample1/bean.xml";
			GenericXmlApplicationContext container = new GenericXmlApplicationContext(resourse);
		
		*/
		
		// 1. 스프링 컨테이너를 생성한다.
		// 2. 스프링 빈 설정 파일을 읽는다.
		// 3. 스프링 빈 설정 파일에 정의된 클래스들을 모두 싱글턴 객체로 미리 생성해 둔다.
		GenericXmlApplicationContext container = new GenericXmlApplicationContext();
		
		// 빈 설정정보를 로드하기 -> 설정파일에 정의된 클래스를 객체로 생성한다.
		container.load("classpath:/com/example/sample1/bean.xml");
		container.refresh();
		
		// 스프링 컨테이너에서 필요한 객체 가져오기
		Operator op = (Operator)container.getBean("o");
		op.plus(10, 20);
		op.minus(30, 20);
	}
}
