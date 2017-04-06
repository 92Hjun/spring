package kr.co.jhta.blog.dao;

import kr.co.jhta.blog.vo.User;

public interface UserDAO {
	
	User getUser(String id);

	void addUser(User user);

}
