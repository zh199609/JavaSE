package com.zl.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.zl.demo03
 * @ClassName: ReferenceCountGC
 * @Author: luzhiwei
 * @Description: TODO
 * @Date: 2019/6/6 16:25
 * @Version: 1.0
 */
public class ReferenceCountGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) throws InterruptedException {
        ReferenceCountGC referenceCountGC = new ReferenceCountGC();
        /*ReferenceCountGC referenceCountGC1 = new ReferenceCountGC();
        referenceCountGC = referenceCountGC1;
        referenceCountGC1 = referenceCountGC;

        referenceCountGC = null;
        referenceCountGC1 = null;
        System.gc();*/
        List<ReferenceCountGC> list = new ArrayList<>();
        System.out.println("我还活着");
        for (int i = 0; i < 50; i++) {
            ReferenceCountGC referenceCountGC1 = new ReferenceCountGC();
            list.add(referenceCountGC1);
        }
        list = null;
        Thread.sleep(1000);
        System.gc();
        System.out.println("我死了…………");
    }
}
