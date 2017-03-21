package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.exmaple.vo.UserVO;

public class UserDAO {
	
	
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		
		this.template = template;
		
	}
	
	public void addNewUser(UserVO user) {
		
		String sql = "insert into tb_user(id,name,phone,email,regdate) values(?,?,?,?,?)";
		template.update(sql, user.getId(),user.getName(),user.getPhone(),user.getEmail(),user.getRegdate());
		
	}
	
	public void deleteAllUser() {
		
		String sql = "delete from tb_user";
		template.update(sql);
		
	}
	
	public List<UserVO> getAllUsers() {
		
		String sql = "select id,name,phone,email,regdate from tb_user order by id";
		
		return template.query(sql, new RowMapper<UserVO>(){
			
			@Override
			public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				UserVO user = new UserVO();
				
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPhone(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setRegdate(rs.getDate("regdate"));
				
				return user;
				
			}
		});
	}
	
	public UserVO getUserById(int id) {
		
		String sql = "select * from tb_user where id = ?";
		
		return template.queryForObject(sql, new RowMapper<UserVO>(){
			
			public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				UserVO user = new UserVO();
				
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPhone(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setRegdate(rs.getDate("regdate"));
				
				return user;
				
			}
			
		} ,id);
	}
	
}
