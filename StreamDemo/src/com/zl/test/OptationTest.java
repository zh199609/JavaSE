package com.zl.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import static java.util.stream.Collectors.*;

import com.zl.entity.SysUser;

public class OptationTest {

    public static void main(String[] args) {
        List<SysUser> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            if (i%3==0) {
                sysUser.setUserName("编号：1");
            }else {
                sysUser.setUserName("编号：2");
            }
            sysUser.setAge(8);
            if (i%2==0) {
                sysUser.setUserPassword("pwd");
            } else {
                sysUser.setUserPassword("密码");
            }
            list.add(sysUser);
        }
        
        /*可以看到有三个参数，第一个参数就是key的Function了，第二个参数是一个map工厂，也就是最终结果的容器，一般默认的是采用的HashMap::new，最后一个参数很重要是一个downstream，类型是Collector，也是一个收集器，那就是说，这三个参数其实就是为了解决分组问题的

                                第一个参数：分组按照什么分类
                                
                                第二个参数：分组最后用什么容器保存返回
                                
                                第三个参数：按照第一个参数分类后，对应的分类的结果如何收集
                                 
                                其实一个参数的Collectors.groupingBy方法的 ，第二个参数默认是HashMap::new， 第三个参数收集器其实默认是Collectors.toList
        */
        
        //分组
        /*Map<String, List<SysUser>> collect2 = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,Collectors.toList()));
        System.out.println(collect2);
        
        System.out.println("================");
        Map<String, Map<String, Long>> map = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,
                Collectors.groupingBy(SysUser::getUserPassword,Collectors.counting())));
        map.forEach((K,V)->System.out.println("k:"+K+"--V:"+V));
        System.out.println("==================================================================");
        
        Map<String, List<SysUser>> collect = list.stream().collect(Collectors.groupingBy(SysUser::getUserName));
        Stream<Entry<String, List<SysUser>>> stream = collect.entrySet().stream();
        stream.forEach(m->m.getValue());*/
        
        //按类别分组  Collectors.count()
        /*Map<String, List<SysUser>> collect2 = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,Collectors.toList()));
        System.err.println(collect2);*/
        
        //Function.identity()   value -> value   默认实现
        /*Map<SysUser, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.err.println(collect);*/
        
        //分组 在求该分组下某个属性的和
        /*Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,Collectors.summingLong(SysUser::getAge)));
        Map<String, Double> collect3 = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,Collectors.averagingInt(SysUser::getAge)));
        System.err.println(collect3);*/
       
        
        
        //去重
        /*List<SysUser> list2 = list.stream().collect(collectingAndThen(toCollection(()->new TreeSet<>(Comparator.comparing(SysUser::getAge))), ArrayList::new));
        System.out.println("去重后list:"+list2);*/
        
        
        
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
