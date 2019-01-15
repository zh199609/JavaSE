package com.zl.test;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.zl.entity.SysUser;

public class StreamTest2 {

    public static void main(String[] args) {
        List<SysUser> list = new ArrayList<>();
        Random seed = new Random();
        for (int i = 1; i < 1000000; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            sysUser.setUserName("编号：" + i);
            sysUser.setAge(seed.nextInt());
            list.add(sysUser);
        }
        //list.forEach(System.out::println);
        System.err.println("--------------------------------------");
        //排序
        Stream<SysUser> sorted = list.stream().sorted(Comparator.comparing(SysUser::getAge).reversed());

        /*Collator instance = Collator.getInstance(new Locale("zh", "cn"));
        Comparator<BedModel> comparator = new Comparator<BedModel>() {
            @Override
            public int compare(BedModel o1, BedModel o2) {
                return instance.compare(o1.getBuildingName(), o2.getBuildingName());
            }
        };*/

        /*List<BedModel> collect = bedModels.stream().sorted((o1,o2)->
                Collator.getInstance(new Locale("zh", "cn")).compare(o1.getBuildingName(), o2.getBuildingName())
        ).collect(Collectors.toList());*/


        
        //找出最大的
        //Optional<SysUser> min = list.stream().max(Comparator.comparing(SysUser::getAge));
        
        //并行处理
        long start = System.currentTimeMillis();
        Optional<SysUser> max = list.parallelStream().max(Comparator.comparing(SysUser::getAge));
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        long start2 = System.currentTimeMillis();
        Optional<SysUser> max2 = list.stream().max(Comparator.comparing(SysUser::getAge));
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

        System.err.println(max.get());
        System.err.println(max2.get());

        //sorted.forEach(System.out::println);
        
        
        
        
        
        
        
    }

}
