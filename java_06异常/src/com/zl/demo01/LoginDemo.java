package com.zl.demo01;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String pass = sc.nextLine();
		UserService us = new UserService();
		try {
			User user = us.login(name, pass);
			System.out.println("登录成功");
			System.out.println(user);
		} catch (MyException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * Exception:受检异常，在编译期检查，在调用这个异常方法时
	 * 	必须使用try……catch……
	 * RuntimeException；非首件异常，在运行期检查，在调用方法时不用显式调用try……catch……
	 */

}


