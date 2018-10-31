package com.zl.test;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zl.entity.SysUser;

public class OptationTest {

    public static void main(String[] args) {
        List<SysUser> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            sysUser.setUserName("编号：1");
            sysUser.setAge(i);
            list.add(sysUser);
        }
        
        //分组
        //Map<Integer, List<SysUser>> collect = list.stream().collect(Collectors.groupingBy(SysUser::getAge));
        
        //按类别分组  Collectors.count()
       /* Map<String, List<SysUser>> collect2 = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,Collectors.toList()));
        System.err.println(collect2);*/
        
        
        /*Map<SysUser, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.err.println(collect);*/
        
       /* Map<String, Integer> collect2 = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,Collectors.summingInt(SysUser::getAge)));
        Map<String, Double> collect3 = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,Collectors.averagingInt(SysUser::getAge)));
        System.err.println(collect2);*/
        
        
        String string = "zl";
        
        /*String of = Optional.ofNullable(string).orElse("asdfasdf");
        Optional<String> ofNullable = Optional.ofNullable("dsf");
        
        System.err.println("获取："+Optional.empty());
        System.err.println("获取："+ofNullable.isPresent());*/
        
        
        
        
        /*Optional<String> optional = Optional.ofNullable(string);
        String orElseGet = optional.orElseGet(()->"asf");
        System.err.println(orElseGet);*/
        
        
        /*Optional<String> optional = Optional.ofNullable(string);
        Optional<String> filter = optional.filter(a->a.equals("zl"));
        System.err.println(filter.get());*/
        
        
        
       
    }
}
