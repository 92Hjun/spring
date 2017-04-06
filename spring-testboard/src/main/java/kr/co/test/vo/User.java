package kr.co.test.vo;

public class User {
	
	private String id;
	private String pwd;
	private String userEmpty;
	private String department;
	
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserEmpty() {
		return userEmpty;
	}
	public void setUserEmpty(String userEmpty) {
		this.userEmpty = userEmpty;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", userEmpty=" + userEmpty + ", department=" + department + "]";
	}
	
	
	
}
