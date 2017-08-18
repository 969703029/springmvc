package org.framestudy.springmvc20170818.pojos;

public class UserInfo {

	private Long id;
	private String loginName;
	private String password;
	
	
	
	
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", loginName=" + loginName + ", password=" + password + "]";
	}
}
