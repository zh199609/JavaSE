package com.zl.stream;

import com.zl.entity.Room;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01 {


    public List<Room> getData() {
        List<Room> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Room room = new Room();
            room.setId(i);
            room.setName("第" + i + "间房");
            room.setPrice(new BigDecimal(i));
            list.add(room);
        }
        return list;
    }

    @Test
    /**
     * map生成的是个1:1映射，每个输入元素都按照规则转换成为另外一个元素
     * 是一对多映射关系的，这时需要flatMap
     */
    public void testMap() {
        List<Room> data = getData();
        List<Integer> collect = data.stream().map(o -> o.getId()).collect(Collectors.toList());
        System.out.println(collect);
        List<String> list = data.stream().flatMap(o -> Arrays.stream(o.getName().split("间"))).distinct().collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void testPeek() {
        List<Room> data = getData();
        List<Room> collect = data.stream().peek(o -> System.out.println(o.getId())).peek(o -> System.out.println(o.getName())).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    /**
     * 　这个方法的主要作用是把Stream元素组合起来。它提供一个起始值（种子），然后依照运算规则（BinaryOperator），
     * 和前面Stream的第一个、第二个、第n个元素组合。从这个意义上说，字符串拼接、数值的 sum、min、max、average都是特殊的reduce
     */
    public void testReduce() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> reduce = integerStream.reduce(Integer::sum);
        System.out.println("求和 ====" + reduce.get());
    }

    @Test
    /**
     * 　limit返回Stream的前面n个元素；skip则是扔掉前n个元素
     */
    public void testLimitSkip() {
        List<Room> data = getData();
        List<Room> collect = data.stream().limit(3).skip(3).collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test() {
        List<Room> data = getData();
        Map<String, List<Room>> map = new HashMap<>();
        for (Room datum : data) {
            String id = datum.getName();
            map.computeIfAbsent(id, key -> new LinkedList<>()).add(datum);
        }
    }





}
