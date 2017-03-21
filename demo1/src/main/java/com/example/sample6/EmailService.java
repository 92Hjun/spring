package com.example.sample6;

public class EmailService {
	
	private String host;
	private int port;
	private String userName;
	private String password;
	
	public EmailService(String host, int port, String userName, String password) {
		
		this.host = host;
		this.port = port;
		this.userName = userName;
		this.password = password;
		
	}
	
	
	public void connect(){
		
		System.out.println("["+host+"] ["+port+"] ["+userName+"] ["+password+"] 로 연결시도");
		
	}
	
}
