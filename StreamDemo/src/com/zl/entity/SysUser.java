package com.zl.entity;
/*
 * 用户表
 */

import java.util.Arrays;
import java.util.Date;

import com.zl.val.MyVal;

public class SysUser {

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private Long id;

    private String userName;
    
    @MyVal(description="密码",MaxNum=7)
    private String userPassword;

    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String userEmail;

    private String userInfo;

    private Date createTime;
    
    private String sex;

    @Override
    public String toString() {
        return "SysUser [id=" + id + ", userName=" + userName + ", age=" + age + "]";
    }

    public SysUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SysUser(Long id, String userName, int age) {
        super();
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public SysUser(Long id, String userName, int age, String sex) {
        super();
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

}
