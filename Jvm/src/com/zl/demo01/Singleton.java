package com.zl.demo01;

//单例延迟初始化单例延迟初始化
public class Singleton {
    private Singleton() {
    }

    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1000000000) ? -100000000 : n + 1;
    }

    public static void main(String[] args) {
        System.out.println(0b01111111111111111111111111111110);
        System.out.println(0b10000000000000000000000000000000);
        System.out.println(0b01111111111111111111111111111111);
        System.out.println(-4 >>> 1);
    }
}
