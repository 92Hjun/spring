package kr.co.jhta.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jhta.blog.dao.UserDAO;
import kr.co.jhta.blog.vo.User;

@Service
public class UserServiceImpl implements UserService{
		
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User getUser(String id) {
		User user = userDAO.getUser(id);
		return user;
	}

	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
		
	}
	

}
