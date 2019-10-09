package com.zl.test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName ReduceTest
 * @Description Reduce
 * @Date 2019/10/9 16:05
 * @Author albertzh
 **/
public class ReduceTest {
    public static void main(String[] args) {
        ReduceTest reduceTest = new ReduceTest();
        reduceTest.test01();
    }


    public void test01() {
        Integer[] arr = new Integer[]{1};
        List<Integer> list = Arrays.asList(arr);
        //第一个参数是上次函数执行的返回值
        Optional<Integer> reduce = list.stream().reduce((integer, integer2) ->
                integer + integer2
        );
        System.out.println(reduce.get());

        BigDecimal[] bigDecimals = new BigDecimal[]{new BigDecimal("1.23"), new BigDecimal("2.36"), new BigDecimal("1.00")};
        List<BigDecimal> bigDecimals1 = Arrays.asList(bigDecimals);
        Optional<BigDecimal> reduce1 = bigDecimals1.stream().reduce((bigDecimal, bigDecimal2) ->
                bigDecimal.add(bigDecimal2)
        ).map(bigDecimal -> {
            return bigDecimal.add(new BigDecimal("1"));
        });
        System.out.println(reduce1.get());


        Optional<String> aa = Optional.of("aaaaa");
        Optional<String> s1 = aa.map(s -> {
            return "ssssss";
        });
        System.out.println(s1.get());
    }
}
