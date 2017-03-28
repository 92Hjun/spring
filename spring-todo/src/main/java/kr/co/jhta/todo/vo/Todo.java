package kr.co.jhta.todo.vo;

import java.util.Date;

public class Todo {
	private int no;
	private String title;
	private Date eventDate;
	private String description;
	private String completed;
	private User user;
	private String mapFilename;
	private String attachFilename;
	private Date regdate;

	public Todo(){}
	
	public Todo(int no, String title, Date eventDate,String mapFilename, String attachFilename, String description, String completed, User user, Date regdate) {
		this.attachFilename = attachFilename;
		this.no = no;
		this.mapFilename = mapFilename;
		this.title = title;
		this.eventDate = eventDate;
		this.description = description;
		this.completed = completed;
		this.user = user;
		this.regdate = regdate;
	}

	public String getAttachFilename() {
		return attachFilename;
	}

	public void setAttachFilename(String attachFilename) {
		this.attachFilename = attachFilename;
	}

	public String getMapFilename() {
		return mapFilename;
	}

	public void setMapFilename(String mapFilename) {
		this.mapFilename = mapFilename;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
