package com.zl.entity;
/*
 * 用户表
 */

import java.util.Arrays;
import java.util.Date;

public class SysUser {

    private Long id;

    private String userName;

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


    @Override
    public String toString() {
        return "SysUser [id=" + id + ", userName=" + userName + ", age=" + age + "]";
    }

    public SysUser() {
        super();
        // TODO Auto-generated constructor stub
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

}
