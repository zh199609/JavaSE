package com.zl.demo03;

/**
 * @Package: com.zl.demo03
 * @ClassName: testPretenureSizeThreshold
 * @Author: luzhiwei
 * @Description: 年龄
 * @Date: 2019/6/10 16:09
 * @Version: 1.0
 * 虚拟机参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 *
 * 虚拟机给每个对象定义了一个年龄，如果对象在Eden区出生并经过第一次MinorGc后任然存活，并且能被Survivor容纳，将进入Survivor中，年龄+1
 * 对象在Survivor中没“熬过”一次Minor GC，年龄就增加1，年龄增加到15（默认）将被晋升到老年代中   MaxTenuringThreshold可设置阈值
 *
 */
public class testTenuringThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
       /* allocation3 = null;
        allocation3 = new byte[4 * _1MB];*/
    }
}
