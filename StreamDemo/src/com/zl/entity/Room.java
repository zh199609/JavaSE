package com.zl.entity;

import java.math.BigDecimal;

/**
 * @ClassName: Room
 * @Description: TODO
 * @Author: zl
 * @Date: 2019/7/28 22:25
 * @Version: 1.0
 **/
public class Room {

    private Integer id;

    private String name;
    private BigDecimal price;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
