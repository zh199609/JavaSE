package com.zl.demo01;

public class UserService {
	public User login(String username, String password) throws MyException {
		if (!"admin".equals(username)) {
			throw new MyException("用户名错误");
		}
		if (!"123".equals(password)) {
			throw new MyException("密码错误");
		}

		User user = new User("admin", "123", 18, "nan");
		return user;
	}
}
