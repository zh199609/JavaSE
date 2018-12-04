package com.zl.test;

import java.util.ArrayList;
import java.util.List;

import com.zl.entity.SysUser;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<SysUser> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            if (i % 3 == 0) {
                sysUser.setUserName("编号：1");
            } else {
                sysUser.setUserName("编号：2");
            }
            sysUser.setAge(i);
            if (i % 2 == 0) {
                sysUser.setUserPassword("pwd");
            } else {
                sysUser.setUserPassword("密码");
            }
            list.add(sysUser);
        }
        
        
        
        
        
    }
}
