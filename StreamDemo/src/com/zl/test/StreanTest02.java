package com.zl.test;

import java.util.ArrayList;
import java.util.List;

import com.zl.entity.SysUser;

public class StreanTest02 {

    public static void main(String[] args) {
        List<SysUser> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            sysUser.setUserName("编号：" + i);
            sysUser.setAge(i);
            System.err.println(sysUser);
            list.add(sysUser);
        }
       
    }
}
