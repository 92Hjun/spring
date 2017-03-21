package com.example.vo;

public class Role {
	private String userName;
	private String type; // user admin
	
	public Role(String userName, String type) {
	
		this.userName = userName;
		this.type = type;
		
	}

	public String getUserName() {
		return userName;
	}

	public String getType() {
		return type;
	}
	
	
}
