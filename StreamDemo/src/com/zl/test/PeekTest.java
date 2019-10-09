package com.zl.test;

import com.zl.entity.SysUser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName PeekTest
 * @Description TODO
 * @Date 2019/10/9 16:33
 * @Author albertzh
 **/
public class PeekTest {
    public static void main(String[] args) {
        PeekTest peekTest = new PeekTest();
        peekTest.test01();

    }

    public void test01() {
        List<SysUser> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setId(Long.valueOf(i));
            sysUser.setUserName("编号：" + i);
            sysUser.setAge(i);
            list.add(sysUser);
        }
        list.stream().peek(sysUser -> System.out.println("value:" + sysUser)).collect(Collectors.toList());

        List<String> collect = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }
}
