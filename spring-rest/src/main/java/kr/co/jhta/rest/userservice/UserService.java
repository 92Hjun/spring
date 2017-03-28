package kr.co.jhta.rest.userservice;

import java.util.List;

import kr.co.jhta.rest.vo.User;

public interface UserService {
	
	List<User> getAllUsers();
	User getUserByNo(int no);
	User saveUser(User user);
	User deleteUser(int no);
	void updateUser(User user);
}
