package cn.itcast.model;

public class User {
	private String userName;
	private String password;
	private String realName;
	private String email;
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String userName, String password, String nickName, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.realName = nickName;
		this.email = email;
	}
	
	public User() {
		
	}
}
