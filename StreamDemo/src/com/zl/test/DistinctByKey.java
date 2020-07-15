/*
 * CMB Confidential
 *
 * Copyright (C) 2020 China Merchants Bank Co., Ltd. All rights reserved.
 *
 * No part of this file may be reproduced or transmitted in any form or by any
 * means, electronic, mechanical, photocopying, recording, or otherwise, without
 * prior written permission of China Merchants Bank Co., Ltd.
 */
package com.zl.test;

import com.alibaba.fastjson.JSONObject;
import com.zl.entity.Room;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author albertzh
 * @Description 自定义去重
 * @Date 2020/6/1815:41
 **/
public class DistinctByKey {
    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        //记录已有对象或者属性
        ConcurrentSkipListMap<Object, Boolean> skipListMap = new ConcurrentSkipListMap<>();
        Predicate<T> predicate = t -> skipListMap.putIfAbsent(JSONObject.toJSONString(keyExtractor.apply(t)), Boolean.TRUE) == null;
        return predicate;
    }


    public static void main(String[] args) {
        List<Room> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Room room = new Room();
            int re = i & 1;
            room.setId(re);
            room.setName(String.valueOf(re));
            list.add(room);
        }
        List<Room> collect = list.stream().filter(distinctByKey(Room::getId)).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(collect));

        List<String> objects = new ArrayList<>();
        Map<String, String> objectObjectLinkedHashMap = new LinkedHashMap<>(100000);
        for (int i = 0; i < 100000; i++) {
            String s = UUID.randomUUID().toString();
            objects.add(s);
            objectObjectLinkedHashMap.put(s, s);
        }
        int i = 0;
        long start = System.currentTimeMillis();
        for (Map.Entry<String, String> stringStringEntry : objectObjectLinkedHashMap.entrySet()) {
            String s = objects.get(i++);
            if (stringStringEntry.getKey().equals(s) && stringStringEntry.getValue().equals(s)) {
                continue;
            }
            System.out.println(s + "顺序错误");
        }
        long e = System.currentTimeMillis();
        System.out.println(e - start);
    }

}
