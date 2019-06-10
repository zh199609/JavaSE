package com.zl.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.zl.demo03
 * @ClassName: OOMTest
 * @Author: luzhiwei
 * @Description: TODO
 * @Date: 2019/6/6 15:16
 * @Version: 1.0
 */
public class OOMTest {
    public static void main(String[] args) {
        List<Pojo> list = new ArrayList<>();
        while (true) {
            list.add(new Pojo());//GC对堆  方法区进行垃圾收集
        }
    }
}
