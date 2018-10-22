package com.zl.demo01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * set接口
 * 1.无序
 * 2.不允许重复元素
 * HashSet、TreeSet、LinkedHashSet
 * 
 * 如果要排序选择TreeSet
 * 如果不要排序，也不要保证顺序选择HashSet
 * 不要排序，要保证顺序，选择LinkedHashSet
 * @author zl
 * @description
 */
public class SetDemo {
	public static void main(String[] args) {
		SetDemo t = new SetDemo();
		t.hashSet();
		//t.treeSet();
	}
	/**
	 * HashSet
	 * 1.实现原理，基于哈希表（HashMap）实现
	 * 2.不允许重复，可以有一个NULL元素
	 * 3.不能保证顺序恒久不变
	 * 4.添加元素时把元素作为HashMap的key存储，HashMap的value使用一个固定的object对象
	 * 5.排除重复元素是通过equlas来检查对象是否相同
	 * 6.判断两个对象是否相同，先判断两个对象的hashcode是否相同
	 * ，如果不同，则两个对象不是同一个对象，如果相同，还进行equals判断
	 * 7.自定义对象要认为属性值都相同时为同一对象，有这种需求时，那么要重写hashcode和equals方法
	 * （小结）
	 * 1.哈希表的存储结构，数组+链表，数组中的每个元素以链表的形式存储
	 * 2.如何把对象存储到哈希表中，先计算对象的hashcode值，再对数组的长度求余数，来决定存储位置
	 * 
	 * 
	 */
	public void hashSet() {
		Set<String> set  =new HashSet<>();
		set.add("发生的");
		set.add("sdf");
		set.add("sgg");
		set.forEach(System.out::print);
		String[] name = set.toArray(new String[] {});
		for (String string : name) {
			System.out.println(string);
		}
		
		Cat c1 = new Cat("喵喵",5,1);
		Cat c2 = new Cat("喵喵2",5,2);
		Cat c3 = new Cat("喵喵3",5,3);
		Cat c4 = new Cat("喵喵",5,1);
		Set<Cat> cats = new HashSet<>();
		cats.add(c1);
		cats.add(c2);
		cats.add(c3);
		cats.add(c4);
		System.out.println(cats.size());
		System.out.println("c1:"+c1.hashCode());
		System.out.println("c4:"+c4.hashCode());
	}
	
	/**
	 * 有序的，基于TreeMap(二叉树数据结构)，对象需要比较大小通过对象比较器来实现
	 * 对象比较器还可以去除重复元素，如果自定义的类没有实现比较器结构将无法添加到TreeSet
	 * 集合中
	 */
	public void treeSet() {
		TreeSet<Cat> tree = new TreeSet<>(new CatComparator());
		Cat c1 = new Cat("喵喵",5,1);
		Cat c2 = new Cat("喵喵2",3,2);
		Cat c3 = new Cat("喵喵3",5,3);
		Cat c4 = new Cat("喵喵",4,1);
		tree.add(c1);
		tree.add(c2);
		tree.add(c3);
		tree.add(c4);
		System.out.println(tree.size());
		for (Cat cat : tree) {
			System.out.println(cat);
		}
	}
	
}
