package com.example;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.example.dao.UserDAO;
import com.exmaple.vo.UserVO;

public class App {
	public static void main(String[] args) {
		
		String resources = "classpath:/META-INF/spring/applicationContext.xml";
		GenericXmlApplicationContext container = new GenericXmlApplicationContext(resources);
		
		UserDAO dao = container.getBean("userdao", UserDAO.class);
		
		
		dao.deleteAllUser();
		
		
		UserVO user = new UserVO(1,"홍길동", "010-1111-1111", "gmail.net");
		dao.addNewUser(user);
		
		UserVO user2 = new UserVO(2,"김유신", "010-2222-2222", "kim@naver.com");
		dao.addNewUser(user2);
		
		UserVO user3 = new UserVO(3,"이순신", "010-1232-2352", "lee@naver.com");
		dao.addNewUser(user3);
		
		List<UserVO> userList = dao.getAllUsers();
		
		for (UserVO user4 : userList) {
			
			System.out.println(user4.getName()+user4.getId());
			
		}
		
		UserVO user5 = dao.getUserById(3);
		
		System.out.println(user5.getName());
		
	}
}
