package com.zl.val;

import java.util.Date;

import com.zl.entity.SysUser;

public class Main {

    public static void main(String[] args) throws Exception {
        SysUser sysUser = new SysUser();
        sysUser.setUserPassword("123456sdf789");
        sysUser.setId(1L);
        sysUser.setAge(20);
        sysUser.setCreateTime(new Date());
        sysUser.setUserName("sf");
        sysUser.setUserEmail("!aaa2");
        sysUser.setUserInfo("gsadg");
        VerifyAnnotationMyLimit annotationMyLimit = new VerifyAnnotationMyLimit(sysUser);
        StringBuilder builder = annotationMyLimit.getBuilder();
        System.err.println("verify结果："+builder);
        
    }
    public void test() {
        this.getClass().getResourceAsStream("/kafka.properties");
    }
}
