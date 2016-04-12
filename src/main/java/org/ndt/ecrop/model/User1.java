package org.ndt.ecrop.model;

public class User1 
{

	private String userName;
	private String password;
	private String role;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public User1() {
		// TODO Auto-generated constructor stub
	}
	public User1(String userName, String password, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	@Override
	public String toString() {
		return "User1 [userName=" + userName + ", password=" + password
				+ ", role=" + role + "]";
	}
	
}
