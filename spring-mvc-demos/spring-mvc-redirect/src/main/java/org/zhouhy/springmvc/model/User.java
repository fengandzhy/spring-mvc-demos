package org.zhouhy.springmvc.model;

public class User {
	private Integer id;
	private String username;
	private String password;
	private Department dpt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Department getDpt() {
		return dpt;
	}
	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", dpt=" + dpt + "]";
	}	
}
