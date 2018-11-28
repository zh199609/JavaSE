package com.zl.lambda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class LambdaTest {

    public static void main(String[] args) {
        TestInterface interface1 = String::valueOf;

        String sayHello = interface1.sayHello("zl");
        System.err.println(sayHello);

        List<Integer> ids = Arrays.asList(1, 2, 5, 4, 3);
        Comparator<Integer> comparator = (a, b) -> b - a;
        Comparator<Integer> comparator2 = Integer::compare;
        List<Integer> collect = ids.parallelStream().sorted(comparator2).collect(Collectors.toList());
        System.err.println(collect);

        System.out.println("--------------------------------------");

        TestInterface interface2 = "asf"::concat;
        System.err.println(interface2.sayHello("zl"));

    }

    @Test
    public void test() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("z", new Date()));
        persons.add(new Person("b", new Date()));
        persons.add(new Person("a", new Date()));

        //persons.sort((a, b) -> b.getName().compareTo(a.getName()));
        Comparator<Person> comparing = Comparator.comparing(Person::getName);
        Collections.sort(persons,Comparator.comparing(Person::getName));
        System.err.println(persons);
    }

    @Test
    public void test1() {

        Target target1 = new Target(190);
        Target target2 = new Target(100);
        // 引用实例方法
        MyInterface ins1 = Target::compare;
        System.out.println(ins1.compare(target1, target2));
        
        MyInterface.printHello();
    }
    
    /*Stream的map和flatMap的区别:
    map会将一个元素变成一个新的Stream
            但是flatMap会将结果打平，得到一个单个元素,返回的类型必须是stream*/
    //map和flatmap
    @Test
    public void test2() {
        List<String> list = Arrays.asList("hello welcome", "world hello", "hello world",
                "hello world welcome");
        List<Stream<String>> collect = list.stream().map(item->Arrays.stream(item.split(" "))).distinct().collect(Collectors.toList());
        System.out.println("size:"+collect.size());
        collect.forEach(a->a.forEach(System.out::println));
        System.out.println("----------------------------------------------------");
        Stream<String> distinct = list.stream().flatMap(item->Arrays.stream(item.split(" "))).distinct();
        distinct.forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        List<String[]> collect2 = list.stream().map(this::map).collect(Collectors.toList());
        collect2.forEach(a->System.err.println(Arrays.asList(a)));
        System.out.println("----------------------------------------------------");
        List<String> collect3 = list.stream().map(item->item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        collect3.forEach(System.out::println);
        
        System.out.println("------------------------");
        list.stream().map(str->str.split("")).map(str->Arrays.stream(str));
        
    }
    
    
    public String[] map(String string) {
        return string.split(" ");
    }
    
    
    public void test3() {
        try {
            new FileInputStream("");
            Thread.sleep(1000);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
