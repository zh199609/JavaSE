package com.zl.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.zl.entity.SysUser;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<SysUser> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            if (i % 3 == 0) {
                sysUser.setUserName("编号：1");
            } else {
                sysUser.setUserName("编号：2");
            }
            sysUser.setAge(i);
            if (i % 2 == 0) {
                sysUser.setUserPassword("pwd");
            } else {
                sysUser.setUserPassword("密码");
            }
            list.add(sysUser);
        }

        /*list.stream().flatMap(sysUser -> {
            return
        });*/

    }


    /*Stream的map和flatMap的区别:
    map会将一个元素变成一个新的Stream
            但是flatMap会将结果打平，得到一个单个元素,返回的类型必须是stream*/
    //map和flatmap
    public void test2() {
        List<String> list = Arrays.asList("hello welcome", "world hello", "hello world",
                "hello world welcome");
        List<Stream<String>> collect = list.stream().map(item -> Arrays.stream(item.split(" "))).distinct().collect(Collectors.toList());
        System.out.println("size:" + collect.size());
        collect.forEach(a -> a.forEach(System.out::println));
        System.out.println("----------------------------------------------------");
        Stream<String> distinct = list.stream().flatMap(item -> Arrays.stream(item.split(" "))).distinct();
        distinct.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        List<String[]> collect2 = list.stream().map(this::map).collect(Collectors.toList());
        collect2.forEach(a -> System.err.println(Arrays.asList(a)));
        System.out.println("----------------------------------------------------");
        List<String> collect3 = list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        collect3.forEach(System.out::println);
        System.out.println("------------------------");
        list.stream().map(str -> str.split("")).map(str -> Arrays.stream(str));

    }

    public String[] map(String string) {
        return string.split(" ");
    }
}
