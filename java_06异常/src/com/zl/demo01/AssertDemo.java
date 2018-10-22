package com.zl.demo01;

public class AssertDemo {
	public static void main(String[] args) {
		int result = add(10,10);
		assert result ==10:"结果不正确";
	}
	public static int add(int a,int b) {
		return a+b+1;
	}
}
