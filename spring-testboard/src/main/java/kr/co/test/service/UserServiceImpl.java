package kr.co.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.test.dao.UserDAO;

@Service
public class UserServiceImpl implements UserDAO{
	
	@Autowired
	private UserDAO userDAO;
}
