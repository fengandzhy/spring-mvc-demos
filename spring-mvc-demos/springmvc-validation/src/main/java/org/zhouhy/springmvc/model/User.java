package org.zhouhy.springmvc.model;

import java.util.Date;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;


public class User {
	private Integer id;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
	
	@Past
	private Date birthday;
	
	@Email
	private String email;
	
	@DecimalMin("1.0")
	@DecimalMax("2.5")
	private Double height;
	
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
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", birthday="
				+ birthday + ", email=" + email + "]";
	}	
}
