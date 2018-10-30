package com.zl.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.zl.entity.SysUser;

public class StreamTest {
    static int a = 1;

    @Test
    public void test01() {
        List<SysUser> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            sysUser.setUserName("编号：" + i);
            sysUser.setAge(i);
            list.add(sysUser);
        }
        /*
         * List<SysUser> collect =
         * list.stream().filter(user->user.getAge()>5).collect(Collectors.toList());
         * System.err.println(collect);
         */

        /*
         * List<Integer> collect2 =
         * list.stream().map(SysUser::getAge).collect(Collectors.toList());
         * System.err.println(collect2);
         */

        /*
         * List<Integer> collect = list.stream().map(user -> user.getAge() *
         * 6).collect(toList()); System.err.println(collect);
         * 
         * List<SysUser> collect2 = list.stream().filter(user -> user.getAge() >
         * 5).collect(toList()); System.err.println(collect2);
         */

        /*
         * List<SysUser> collect3 =
         * list.stream().peek(user->System.err.println(user.getAge())).collect(toList())
         * ; System.err.println(collect3);
         */

        /*
         * List<SysUser> collect = list.stream().peek(user->{ user.setAge(10);
         * }).collect(toList()); System.err.println(collect);
         */

        /*
         * String string =null; Optional.ofNullable(string);
         * System.err.println(Optional.ofNullable(string).orElse("asdf"));
         */

        // System.err.println(list.stream());
        /*
         * Optional<SysUser> findFirst = list.stream().findFirst();
         * System.out.println(findFirst.get());
         */

        /*
         * List<Integer> collect =
         * list.stream().map(SysUser::getAge).limit(110).skip(5).collect(toList());
         * System.err.println(collect);
         */

        /*
         * List<SysUser> collect = list.stream().sorted((u1,u2)->(
         * u1.getUserName().compareTo(u2.getUserName())
         * )).limit(156).skip(5).collect(toList()); System.err.println(collect);
         */

        // list.stream().anyMatch(predicate)
        // list.stream().noneMatch(predicate)
        /*
         * boolean allMatch = list.stream().noneMatch(user->( user.getAge()>9 ));
         * System.err.println(allMatch);
         */

        // 生成随机数
        Random seed = new Random();
        Supplier<Integer> random = seed::nextInt;
        List<Integer> collect = Stream.generate(random).limit(10).collect(Collectors.toList());
        System.err.println(collect);
        
        //Stream.iterate(seed, f)
        SysUser sysUser = list.get(0);
        //int a =sysUser::getAge

    }

    public void min_max(List<Integer> list) {
        int size = list.size();
        int min;
        int max;
        if (size % 2 == 0) {
            if (list.get(0) > list.get(1)) {
                max = list.get(0);
                min = list.get(1);
            } else {
                min = list.get(0);
                max = list.get(1);
            }
            for (int i = 2; i < size - 1; i = i + 2) {
                if (list.get(i) > list.get(i + 1)) {
                    if (max < list.get(i)) {
                        max = list.get(i);
                    }
                    if (min < list.get(i + 1)) {
                        min = list.get(i);
                    }
                } else {
                    if (min < list.get(i)) {
                        min = list.get(i);
                    }
                    if (max < list.get(i + 1)) {
                        max = list.get(i);
                    }
                }
            }
        } else {

        }

    }

}
