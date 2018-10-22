package com.zl.demo02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

/**
 * Map接口 1.键值对存储一组对象 2.key不能重复（唯一），values可以重复 3.具体的实现类HashMap、TreeMap、Hashtable
 * LinkedHashMap
 * 
 * 
 * 如何使用选哪个
 * 
 * @author zl
 * @description
 */
public class MapDemo {
	
	public int a;
	
	public static void main(String[] args) {
		MapDemo m = new MapDemo();
		m.hashMap();
		int i=1;
		//m.linkedHashMap();
		//m.hashtable();
		//m.treeMap();
	}
	/**
	 * HashMap的实现原理
	 * 1.基于哈希表（数组+链表+二叉树（红黑树））1.8JDK
	 * 2.默认加载因子（0.75），默认数组大小为16
	 * 3.把对象存储到哈希表中，如何存储的：
	 * 		把key对象通过hash（）方法计算hash值，然后用这个hash值对数组长度（默认16）取余
	 * 	来该key对象在数组中存储的位置，当这个位置有多个对象时，以链表结构存储，JDK当链表长度大于8
	 * 链表转化成红黑树存储，这样的目的，是为了取值更快
	 * 
	 * 4.扩充原理；当数组的容量超过0.75，那么表示该数组需要扩充？
	 * 	扩充的算法：当前数组容量<<1(相当于x2)，扩大一倍，扩充次数过多，会影响性能
	 * 	每次扩充表示哈希表散列(重新计算每个对象的存储位置)，在开发中尽量减少扩充次数带来的性能问题
	 * 5.线程不安全	
	 */
	@Test
	public void hashMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "zl");
		map.put(2, "啊师傅");
		map.put(3, "vince");
		map.put(4, "bin");
		System.out.println(map.size());
		// 从map取值
		// System.out.println(map.get(1));//通过key取value

		// map的遍历
		//1
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry e : entrySet) {
			System.out.println(e.getKey() + "->" + e.getValue());
		}
		//2
		Set<Integer> keys = map.keySet();
		for(Integer i :keys) {
			System.out.println(i+"="+map.get(i));
			
		}
		
		//3遍历值 拿不到key
		Collection<String> values = map.values();
		for(String s :values) {
			System.out.println(s);
		}
		
		//4 foreach
		BiConsumer<Integer, String> con = new BiConsumer<Integer, String>() {

			@Override
			public void accept(Integer t, String u) {
				// TODO Auto-generated method stub
				System.out.println(t+"-"+u);
			}
			
		};
		map.forEach(con);
		//map.forEach((key,value)->System.out.println(key+"-"+value)); 
		
	}
	/**
	 * HashMap与hashtable的区别
	 * 
	 * 
	 * 基于哈希表实现（数组+链表）
	 * 默认数组大小为11，加载因子0.75
	 * 扩充方式原数组大小<<1(*2)+1\
	 * 线程安全
	 * 
	 */
	public void hashtable() {
		Map<String,String> table = new Hashtable<>();
		table.put("one", "zl");
		table.put("two", "Tom");
		table.put("three", "Bin");
		table.forEach((key,value)->System.out.println(key+"-"+value));
	}
	
	
	/**
	 * LinkedHashMap是HashMap的子类，由于HashMap不能保证顺序恒久不变
	 * 此类使用一个双重链表来维护添加顺序
	 */
	public  void linkedHashMap() {
		Map<String,String> map =new LinkedHashMap<>();
		map.put("one", "zl");
		map.put("two", "啊师傅");
		map.put("three", "vince");
		map.forEach((key,value)->System.out.println(key+"-"+value));
	}
	/**
	 * 基于二叉树的红黑树实现
	 */
	public void treeMap() {
//		Map<String,String> map = new TreeMap<>();
//		map.put("one", "zl");
//		map.put("two", "啊师傅");
//		map.put("three", "vince");
//		map.forEach((key,value)->System.out.println(key+"-"+value));
		Map<Dog,String> dogs = new TreeMap<>();
		dogs.put(new Dog(1 ,"拉拉1",3), "dog1");
		dogs.put(new Dog(2 ,"拉拉2",3), "dog2");
		dogs.put(new Dog(3 ,"拉拉3",3), "dog3");
		dogs.forEach((key,value)->System.out.println(key+"-"+value));
	}
	
	
	
	
	
	
	
}
