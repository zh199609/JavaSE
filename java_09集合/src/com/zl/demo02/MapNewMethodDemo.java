package com.zl.demo02;

import java.util.HashMap;
import java.util.Map;

public class MapNewMethodDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "jack");
		map.put(2, "zl");
		
		// String value = map.getOrDefault(4, "null");
		// System.out.println(value);
		 
		
		//只会添加不存在你相同key值
//		String s1 = map.putIfAbsent(2, "faf");
//		System.out.println(s1);
		
		//根据key和value都匹配时才删除
		System.out.println(map.remove(1, "gf"));
		
		//
		//map.replace(2, "vince");
		//map.replace(2, "zl","gag");
		
		//map.compute(1, (k,v1)->v1+"11");
		
		map.computeIfAbsent(5, (val)->val+"777");
		
		
		map.forEach((k, v) -> System.out.println(k + "->" + v));
	}
}
