package com.zl.demo01;
/*
 * 自定异常通常都是通过继承一个异常类来实现
 * 1.Throwable
 * 3.Exception
 * 3.RuntimeException
 * 
 */
public class MyException extends Exception{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
}
