package com.zl.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class IteratorDemo {
	public static void main(String[] args) {
		IteratorDemo t = new IteratorDemo();
		// t.foreach();
		//t.function();
		//t.supplier();
		t.predicateTest();
	}

	public void iterator(Collection<Cat> c) {
		Iterator<Cat> it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	/**
	 * jdk1.8新的迭代方法
	 */
	public void foreach() {
		List<String> list = new ArrayList<>();
		list.add("sdfa");
		list.add("的说法");

		// list.forEach((String s)->{System.out.println(s);});
		list.forEach(System.out::println);
	}

	public void function() {
		String s = strToUpp("zlglgjkgj", (str) -> str.toUpperCase());
		System.out.println(s);
	}

	public String strToUpp(String str, Function<String, String> f) {
		return f.apply(str);
	}
	//代表结果供应商
	public void supplier() {
		List<Integer> list = getNums(10,()->(int)(Math.random()*100));
		list.forEach(System.out::print);
	}

	public List<Integer> getNums(int num, Supplier<Integer> sup) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<num;i++) {
			list.add(sup.get());
		}
		return list;
	}
	//断言  
	public void predicateTest() {
		List<String> list   = Arrays.asList("zl","qq","as","faf");
		List<String> result = filter(list,(s)->s.contains("a"));
		result.forEach(System.out::println);
	}
	public List<String> filter(List<String> list,Predicate<String> p){
		List<String> result = new ArrayList<>();
		for (String s : list) {
			if(p.test(s)) {
				result.add(s);
			}
		}
		return result;
	}
	

}
