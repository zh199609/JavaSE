package com.zl.JConsole;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Demo01
 * @Description: TODO
 * @Author: Administrator
 * @Date: 2019/9/8 9:22
 * @Version: 1.0
 **/
public class Demo01 {

    public Demo01() {
        byte[ ] aByte = new byte[128 * 1024];
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        fill(1000);
    }

    private static void fill(int i) {
        List<Demo01> lis = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lis.add(new Demo01());
        }
    }
}
