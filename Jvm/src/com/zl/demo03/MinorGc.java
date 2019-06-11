package com.zl.demo03;

/**
 * @Package: com.zl.demo03
 * @ClassName: MinorGc
 * @Author: luzhiwei
 * @Description: JVM参数：-Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -verbose:gc -XX:+PrintGCDetails   限制了java堆的大小为20MB,其中10MB分配给新生代
 * @Date: 2019/6/10 15:46
 * @Version: 1.0
 *
 * 对象优先被分配到新生代Eden区，Eden区不够，发生一次MinorGC
 */
public class MinorGc {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2,allocation3, allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation4 = new byte[4*_1MB];//出现一次Minor Gc
    }
}
