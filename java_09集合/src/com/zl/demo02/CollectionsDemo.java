package com.zl.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("jack");
		list.add("tom");
		list.add("zxl");
		// Collections.reverse(list);
		//Collections.shuffle(list);随机排序
		//Collections.sort(list);
		//Collections.swap(list, 0, 2);//交换
		//Collections.rotate(list, 1);//整体向右移动
		
		
//		int ind = Collections.binarySearch(list, "tom");//查找下标
//		System.out.println(ind);
//		System.out.println(Collections.max(list));//返回最大值
//		System.out.println(Collections.min(list));//最小值
		//Collections.fill(list, "bin");//填充
		//System.out.println(Collections.frequency(list, "zxl"));//返回出现的次数
		//Collections.replaceAll(list, "tom", "fasf");
		
		//同步
		//List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
		
		
		//设置不可变集合  用于查询返回  如果查询不到直接返回Collections.emptyList()
		List<String> sList = Collections.emptyList();
		sList.add("gsd");
		
		//disjoint()判断两个集合中是否有相同元素
		System.out.println(list);

	}

}
