package com.zl.demo02;

import java.util.Optional;

public class optionalDemo {
	public static void main(String[] args) {
		Optional<String> op = Optional.of("zxl");
		Optional<String> op2 = Optional.empty();
		System.out.println(op.isPresent());
		System.out.println(op.get());
		//op.ifPresent((value)->System.out.println(value));
		//System.out.println(op2.orElse("无值"));如果有讲值返回，否则返回无值
		
//		System.out.println(op2.orElseGet(()->"defalut"));
//		Optional<String> op3 = op.map((value)->value.toUpperCase());
		
		
		Optional op4 = op.filter((value)->value.length()>3);
		System.out.println(op4.orElse("这个值长度小于3"));
		
	}
}
