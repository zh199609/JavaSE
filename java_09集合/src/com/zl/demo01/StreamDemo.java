package com.zl.demo01;

import java.util.stream.Stream;

/**
 * Stream时元素的集合
 * Stream接口：不是存储数据结构，数据源可以时一个集合，为了函数式编程创造
 *  两种类型的操作方法
 *  1.中间操作（生成一个Stream）
 *  2.结束操作（执行计算操作）
 * @author zl
 * @description
 */
public class StreamDemo {
	public static void main(String[] args) {
		//foreach
		Stream<String> strem = Stream.of("zl","good","day","up","good");
		//strem.forEach((str)->System.out.println(str));
		
		//filter   中间操作
		//strem.filter((s)->s.length()>=3).forEach(System.out::println);
	
		//distinct  去重
		//strem.distinct().forEach(System.out::println);
	
		//map
		//strem.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//reduce
		
		
		
	}
}
