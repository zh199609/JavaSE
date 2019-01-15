package com.zl.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.zl.entity.SysUser;

public class StreanPractice {
    static List<SysUser> list = Arrays.asList(new SysUser(1L, "一号", 21, "男"), new SysUser(2L, "二号", 25, "女"),
            new SysUser(3L, "三号", 16, "女"), new SysUser(4L, "四号", 19, "男"));

    public static void main(String[] args) {
        // 注意，reduce操作每处理一个元素总是创建一个新值，
        // Stream.reduce适用于返回单个结果值的情况
        // 获取年龄总和
        int i = list.parallelStream().mapToInt(SysUser::getAge).reduce(0, (x, y) -> x + y);
        System.out.println("年龄总和：" + i);

        // 获取平均年龄
        double average = list.parallelStream().mapToInt(SysUser::getAge).average().getAsDouble();
        System.out.println("平均年龄：" + average);

        // 与stream.reduce方法不同，Stream.collect修改现存的值，而不是每处理一个元素，创建一个新值
        Double collect = list.stream().collect(Collectors.averagingInt(SysUser::getAge));
        System.out.println("平均年龄：" + collect);

        // 按性别统计数量
        Map<String, Long> collect2 = list.stream()
                .collect(Collectors.groupingBy(SysUser::getSex, Collectors.summingLong(p -> 1)));
        Map<String, Double> collect3 = list.stream()
                .collect(Collectors.groupingBy(SysUser::getSex, Collectors.averagingInt(SysUser::getAge)));

        System.out.println("按性别统计年龄平均值：" + collect3);
        System.out.println("按性别统计数量：" + collect2);

        // 按性别获取姓名
        Map<String, List<String>> collect4 = list.stream().collect(
                Collectors.groupingBy(SysUser::getSex, Collectors.mapping(SysUser::getUserName, Collectors.toList())));
        System.out.println("按性别获取姓名:" + collect4);
        // 分别统计age>20
        Map<Boolean, List<SysUser>> collect5 = list.stream()
                .collect(Collectors.partitioningBy(sysUser -> sysUser.getAge() > 20));
        System.out.println("分别统计age>20:" + collect5);
        List<String> list2 = new ArrayList<>();

        List<? extends Number> aaa = new ArrayList<Integer>();
        Integer integer = new Integer(1);
        //aaa.add(integer);
    }

}
