package com.zl.demo01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author zl
 * @description:用于存储单个对象的集合 List： 有序的 允去多个null ArrayList、Vector、LinkList
 */

/**
 * ArrayList 1.实现原理，采用动态对象数组实现，默认构造方法创建一个空数组 2.第一次添加元素，扩展容量为10，之后的扩充算法+原来数组的一半
 * 3.不合适进行删除或插入操作 4.为了防止数组动态扩充过多，建议创建ArrayList时，给定初始容量 5.线程不安全
 * 
 */
public class ListDemo {

	public void arrayList() {
		List<String> list = new ArrayList<>();
		list.add("拉拉");
		list.add("wwwww");
		String[] array = list.toArray(new String[] {});
		// list.add(1);
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}

	}

	/**
	 * 1.实现原理，采用动态对象数组实现，默认构造创建一个大小为10的对象数组
	 * 2.扩充的算法，当增量为0时，扩充为原来大小的2倍，当增量大于零时，扩充为原来大小加上增量
	 * 3.不合适删除或插入
	 * 4.为了防止数组动态扩充过多，建议创建ArrayList时，给定初始容量 5.线程安全，多线程中使用，效率较低
	 * 
	 * 
	 * Vector与ArrayList的区别
	 * 
	 */

	public void vector() {
		Vector<String> v = new Vector<>();
		v.add("asd");
		v.add("拉拉");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

	/**
	 * 1.实现原理，采用双向链表结构实现
	 * 2.适合插入和删除，性能高
	 * 3.线程不安全
	 */
	public void linkList() {
		LinkedList<String> list = new LinkedList<>();
		list.add("asdasd");
		list.add("撒旦");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	/***
	 * 选择list的实现类
	 * 1.安全问题
	 * 2.是否频繁插入，删除操作（LinkList）
	 * 3.是否存储后遍历
	 */

}
