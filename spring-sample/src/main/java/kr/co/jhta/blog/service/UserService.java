package kr.co.jhta.blog.service;

import kr.co.jhta.blog.vo.User;

public interface UserService {


	User getUser(String id);

	void addUser(User user);

}
