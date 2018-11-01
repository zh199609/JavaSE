package com.zl.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class LambdaTest {

    public static void main(String[] args) {
        TestInterface interface1 = String::valueOf;

        String sayHello = interface1.sayHello("zl");
        System.err.println(sayHello);

        List<Integer> ids = Arrays.asList(1, 2, 5, 4, 3);
        Comparator<Integer> comparator = (a, b) -> a - b;
        Comparator<Integer> comparator2 = Integer::compare;
        Set<Integer> collect = ids.parallelStream().sorted(comparator2).collect(Collectors.toSet());
        System.err.println(collect);

        System.out.println("--------------------------------------");

        TestInterface interface2 = "asf"::concat;
        System.err.println(interface2.sayHello("zl"));

    }

    @Test
    public void test() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("c", new Date()));
        persons.add(new Person("b", new Date()));
        persons.add(new Person("a", new Date()));

        persons.sort((a, b) -> b.getName().compareTo(a.getName()));

        Collections.sort(persons, Comparator.comparing(Person::getName));
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

}
