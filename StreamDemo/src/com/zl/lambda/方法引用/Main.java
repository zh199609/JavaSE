package com.zl.lambda.方法引用;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.Test;

public class Main {

    @Test
    public void test01() {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016,9,1)),
                new Person("001", LocalDate.of(2018,2,1)),
                new Person("002", LocalDate.of(2015,3,1)),
                new Person("004", LocalDate.of(2019,12,1))};
        Arrays.sort(pArr, (a,b)->a.getBirthday().compareTo(b.getBirthday()));
        System.err.println(Arrays.asList(pArr));
        System.err.println(LocalDate.of(2016,12,1));
        System.err.println(LocalDate.of(2016,12,1).compareTo(LocalDate.of(2016,1,1)));
    }
    
    @Test
    public void test02() {
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2016,9,1)),
                new Person("001", LocalDate.of(2018,2,1)),
                new Person("002", LocalDate.of(2017,3,1)),
                new Person("004", LocalDate.of(2015,12,1))};
        Arrays.sort(pArr,Person::compareByAge);
        System.err.println(Arrays.asList(pArr));
    }
}
