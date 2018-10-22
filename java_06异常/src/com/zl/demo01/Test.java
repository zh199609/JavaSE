package com.zl.demo01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author zl
 * @description
 */
public class Test {
	public static void main(String[] args) {
		//div2(20, 0);
		input();
	}

	private static int div2(int a, int b) throws ArithmeticException {
		try {
			int c = a / b;
			return c;
		} catch (Exception e) {
			// TODO: handle exception
			throw new ArithmeticException("除数不能为0");
		}

	}

	private static void input() {

		Scanner input = new Scanner(System.in);
		try {
			int num = input.nextInt();
			System.out.println(num);
		} catch (InputMismatchException e) {
			System.out.println("输入不匹配");
		}
		
		
	}
}
