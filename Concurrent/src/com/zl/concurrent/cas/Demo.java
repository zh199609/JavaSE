package com.zl.concurrent.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author
 * @Description
 * @Date
 */
public class Demo {
    volatile int a;

    public void add() {
        a++;
    }

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(1);
        for (int i = 0; i < 1; i++) {
            atomicInteger.getAndAdd(1);
        }
        System.out.println(atomicInteger);
    }


}
