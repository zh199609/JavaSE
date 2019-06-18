package com.zl.demo03;

/**
 * @Package: com.zl.demo03
 * @ClassName: testHandlePromotion
 * @Author: luzhiwei
 * @Description: TODO
 * @Date: 2019/6/12 16:21
 * @Version: 1.0
 * <p>
 * 分配担保      HandlePromotionFailure
 * <p>
 * <p>
 * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails  -XX:SurvivorRatio=8 -XX:-HandlePromotionFailure
 * 在jdk1.6之后该参数不会生效   只要老年代的连续空间大于新生代对象总大小或者历次晋升的平均大小，就会Minor GC 否则进行Full GC
 */

public class testHandlePromotion {
    static int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6, allocation7;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation1 = null;
        allocation4 = new byte[2 * _1MB];
        allocation5 = new byte[2 * _1MB];
        allocation6 = new byte[2 * _1MB];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[2 * _1MB];
    }
}
