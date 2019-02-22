package com.zl.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.zl.entity.SysUser;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

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

       
          /*List<Integer> collect2 =
          list.stream().map(SysUser::getAge).collect(Collectors.toList());
          System.err.println(collect2);
         */

        /*
         * List<Integer> collect = list.stream().map(user -> user.getAge() *
         * 6).collect(toList()); System.err.println(collect);
         *
         * List<SysUser> collect2 = list.stream().filter(user -> user.getAge() >
         * 5).collect(toList()); System.err.println(collect2);
         */

        //peek接收一个没有返回值的λ表达式，可以做一些输出，外部处理等。map接收一个有返回值的λ表达式，之后Stream的泛型类型将转换为map参数λ表达式返回的类型

       /* List<SysUser> collect3 =
                list.stream().peek(user -> System.err.println(user.getAge())).collect(toList());
        System.err.println("peek------"+collect3);*/


        /*List<SysUser> collect2 = list.stream().peek(user -> {
            user.setAge(10);
        }).collect(toList());
        System.err.println("---------------" + collect2);*/


        /*
         * String string =null; Optional.ofNullable(string);
         * System.err.println(Optional.ofNullable(string).orElse("asdf"));
         */

        // System.err.println(list.stream());
        /*
         * Optional<SysUser> findFirst = list.stream().findFirst();
         * System.out.println(findFirst.get());
         */

        //limit(N):对一个stream进行截取，获取其前N个元素，如果原stream中包含元素的个数小于N，那就获取其所有的元素。
        //skip(N):返回一个丢弃原stream的前N个元素后剩下元素组成的新Stream，如原Strea– allMatch：是不是Stream中的所有元素都满足给定的匹配条件m中包含的元素个数小于N，那么返回空Stream
          /*List<Integer> collect2 =
          list.stream().map(SysUser::getAge).limit(7).skip(0).collect(toList());
          System.err.println(collect2);*/

        //其实不是这样的，转换操作都是lazy的，多个转换操作只会在汇聚操作（见下节）的时候融合起来，一次循环完成

        //汇聚（Reduce）

        SysUser sysUser1 = list.stream().reduce((sysUser, sysUser2) -> {
            return sysUser2;
        }).get();
        System.out.println(sysUser1);




        /*
         * List<SysUser> collect = list.stream().sorted((u1,u2)->(
         * u1.getUserName().compareTo(u2.getUserName())
         * )).limit(156).skip(5).collect(toList()); System.err.println(collect);
         */

        list.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge());
        list.stream().sorted(comparing(SysUser::getAge));


        // list.stream().anyMatch(predicate)
        // list.stream().noneMatch(predicate)
        /*
         * boolean allMatch = list.stream().noneMatch(user->( user.getAge()>9 ));
         * System.err.println(allMatch);
         */

        // 生成随机数
        Random seed = new Random();
        Supplier<Integer> random = seed::nextInt;
        List<Integer> collect = Stream.generate(random).limit(10).collect(toList());
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
