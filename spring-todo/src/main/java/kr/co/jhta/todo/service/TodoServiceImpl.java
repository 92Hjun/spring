package kr.co.jhta.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import kr.co.jhta.todo.dao.TodoDAO;
import kr.co.jhta.todo.dao.UserDAO;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodoDAO todoDAO;
	@Autowired
	private UserDAO userDAO;
	
}
