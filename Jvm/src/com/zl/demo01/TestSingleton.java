package com.zl.demo01;

public class TestSingleton {

    private TestSingleton() {
    }

    private static class LazyHolder {
        static final TestSingleton INSTANCE = new TestSingleton();

        static {
            System.out.println("<init...>");
        }
    }

    public static Object getInstance(boolean flag) {
        if (flag) {
            return new LazyHolder[2];
        } else {
            return LazyHolder.INSTANCE;
        }
    }

    public static void main(String[] args) {
       
        getInstance(true);
        System.out.println("------------------------------");
        getInstance(false);
    }
}
