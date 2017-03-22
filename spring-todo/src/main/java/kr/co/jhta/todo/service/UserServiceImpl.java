package kr.co.jhta.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.jhta.todo.dao.UserDAO;
import kr.co.jhta.todo.vo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void registerUser(User user) {
		
		User saveUser = userDAO.getUserById(user.getId());
		
		
		if (saveUser == null){
			
			userDAO.addUser(user);
			
		}else {
			throw new RuntimeException("동일한 아이디로 가입한 사용자가 있습니다.");
		}
		
	}
	
	@Override
	public User getLoginUserInfo(String id, String pwd) {
		User saveUser = userDAO.getUserById(id);
		
		if (saveUser == null) {
			throw new RuntimeException("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		if (!saveUser.getPwd().equals(pwd)){
			throw new RuntimeException("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		
		return saveUser;
	}
}
