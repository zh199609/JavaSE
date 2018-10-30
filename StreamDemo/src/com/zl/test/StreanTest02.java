package com.zl.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.zl.entity.SysUser;

public class StreanTest02 {

    public static void main(String[] args) {
        List<SysUser> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            sysUser.setUserName("编号：" + i);
            sysUser.setAge(10);
            list.add(sysUser);
        }
        
        //分组
        Map<Integer, List<SysUser>> collect = list.stream().collect(Collectors.groupingBy(SysUser::getAge));
        
        //按类别分组  Collectors.count()
        Map<String, List<SysUser>> collect2 = list.stream().collect(Collectors.groupingBy(SysUser::getUserName,Collectors.toList()));
        System.err.println(collect2);
        
        
        
        
       
    }
}
