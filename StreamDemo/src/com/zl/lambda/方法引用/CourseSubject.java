/*
 * CMB Confidential
 *
 * Copyright (C) 2018 China Merchants Bank Co., Ltd. All rights reserved.
 *
 * No part of this file may be reproduced or transmitted in any form or by any
 * means, electronic, mechanical, photocopying, recording, or otherwise, without
 * prior written permission of China Merchants Bank Co., Ltd.
 */

package com.zl.lambda.方法引用;

import java.util.Date;
import java.util.Objects;

/**
 * 学习主题
 *
 * @author Ray
 */
public class CourseSubject {
    private Integer id;
    /**
     * 学习主题
     */
    private String name;
    /*
     * 数据有效标识:true表示有效,false表示无效
     */
    private Boolean valid;
    private String creatorId;
    private String creatorName;
    private Date createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CourseSubject) {
            CourseSubject subject = (CourseSubject) obj;
            return Objects.equals(id, subject.getId());
        }
        return super.equals(obj);
    }
    
    public static void main(String[] args) {
        CourseSubject courseSubject1 = new CourseSubject();
        courseSubject1.setId(1);
        CourseSubject courseSubject2 = new CourseSubject();
        String a= "aaha";
        String b = "aaa";
        System.out.println(a+"===="+b);
        
        
    }

}
