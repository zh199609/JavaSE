package com.zl.demo03;

/**
 * @Package: com.zl.demo03
 * @ClassName: testPretenureSizeThreshold
 * @Author: luzhiwei
 * @Description: 大对象直接进入老年代
 * @Date: 2019/6/10 16:09
 * @Version: 1.0
 * 虚拟机参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:PretenureSizeThreshold=3145728
 *  PretenureSizeThreshold大于设置值的对象直接在老年代中分配，避免在Eden区及两个Survivior区发生大量复制
 *  该参数只对Serial和ParNew两款收集器有效
 */
public class testPretenureSizeThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[9*_1MB];
    }
}
