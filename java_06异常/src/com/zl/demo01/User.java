package com.zl.demo01;

public class User {
	private String username;
	private String password;
	private int age;
	private String sex;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + ", sex=" + sex + "]";
	}

	public User(String username, String password, int age, String sex) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
