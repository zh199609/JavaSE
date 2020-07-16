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
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01 {


    public List<Room> getData() {
        List<Room> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
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
        List<Integer> collect1 = data.stream().map(room -> room.getId() * room.getId()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }

    /**
     * flatMap 把 input Stream 中的层级结构扁平化，就是将最底层元素抽出来放到一起，最终 output 的新 Stream 里面已经没有 List 了，都是直接的数字
     */
    @Test
    public void testFlatMap() {
        System.out.println(Arrays.asList("弟0间房".split("间")));
        List<Room> data = getData();
        List<String> list = data.stream().flatMap(o -> Arrays.stream(o.getName().split("间"))).distinct().collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void testFilter() {
        List<Room> data = getData();
        List<Room> collect = data.stream().filter(room -> (room.getId() & 1) == 0).collect(Collectors.toList());
        System.out.println(collect);
        Stream<Room> roomStream = data.stream().filter(room -> (room.getId() & 1) == 0);
        Stream<String> stringStream = data.stream().flatMap(room -> Arrays.stream(room.getName().split("间")));
        System.out.println(stringStream.collect(Collectors.toList()));
    }

    @Test
    public void testPeek() {
        List<Room> data = getData();
/*        List<Room> collect = data.stream().peek(o -> System.out.println(o.getId())).peek(o -> System.out.println(o.getName())).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("-----------------");*/
        data.stream().filter(room -> (room.getId() & 1) == 0).peek(o -> System.out.print(o)).filter(o -> o.getId() > 5).peek(o -> System.out.print(o)).collect(Collectors.toList());
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

        // 求最小值，minValue = -3.0
        double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
        System.out.println(minValue);
    }

    @Test
    /**
     * 　limit返回Stream的前面n个元素；skip则是扔掉前n个元素
     */
    public void testLimitSkip() {
        List<Room> data = getData();
        List<Room> collect = data.stream().limit(3).skip(2).collect(Collectors.toList());
        System.out.println(collect);
    }


    /**
     * 通过实现 Supplier 接口，你可以自己来控制流的生成。这种情形通常用于随机数、常量的 Stream，
     * 或者需要前后元素间维持着某种状态信息的 Stream。把 Supplier 实例传递给 Stream.generate() 生成的 Stream，
     * 默认是串行（相对 parallel 而言）但无序的（相对 ordered 而言）。由于它是无限的，在管道中，必须利用 limit 之类的操作限制 Stream 大小。
     */
    @Test
    public void testSupplier() {
        Random random = new Random();
        Supplier<Integer> supplier = random::nextInt;
        List<Integer> collect = Stream.generate(supplier).limit(1000000).collect(Collectors.toList());
        System.out.println(collect.size());
    }

    /**
     * groupingBy/partitioningBy
     */
    @Test
    public void testGroupingBy() {
        List<Room> data = getData();
        Map<Boolean, List<Room>> collect = data.stream().collect(Collectors.partitioningBy(room -> room.getId() > 10));
        for (Map.Entry<Boolean, List<Room>> booleanListEntry : collect.entrySet()) {
            System.out.println(booleanListEntry.getKey() + ":" + booleanListEntry.getValue());
        }
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
