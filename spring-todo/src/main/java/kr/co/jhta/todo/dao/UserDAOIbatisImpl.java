package kr.co.jhta.todo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.todo.vo.User;

@Repository
public class UserDAOIbatisImpl implements UserDAO{
	
	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public void addUser(User user) {
		template.insert("addUser", user);
		
	}
	@Override
	public User getUserById(String id) {
		
		return (User)template.queryForObject("getUserById", id);
	}
	
	@Override
	public void decreaseCompletedTodoAmount(int userno) {
		template.update("decreaseCompletedTodoAmount", userno);
	}
	@Override
	public void decreaseUncompletedTodoAmount(int userno) {
		template.update("decreaseUncompletedTodoAmount", userno);
		
	}
	@Override
	public void increaseCompletedTodoAmount(int userno) {
		template.update("increaseCompletedTodoAmount", userno);
		
	}
	@Override
	public void increaseUncompletedTodoAmount(int userno) {
		template.update("increaseUncompletedTodoAmount", userno);
		
	}
	
}
