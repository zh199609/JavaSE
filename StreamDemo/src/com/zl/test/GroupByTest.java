package com.zl.test;

import com.zl.entity.Room;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @ClassName: GroupByTest
 * @Description: TODO
 * @Author: zl
 * @Date: 2019/7/28 22:25
 * @Version: 1.0
 **/
public class GroupByTest {


    public static void main(String[] args) {
        List<Room> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Room room = new Room();
            room.setId(i);
            if (i%2 ==0){
                room.setName("1");
            }else{
                room.setName("2");
            }
            room.setPrice(new BigDecimal(i));
            list.add(room);
        }

       /* list.stream().collect(groupingBy(Room::getName,HashMap::new,Collectors.reducing((x,y)-> x.getPrice().add(y.getPrice())).));
*/

        List<BigDecimal> collect = list.stream().collect(Collectors.mapping(Room::getPrice, Collectors.toList()));
        System.out.println(collect);



    }



}


