package com.zl.concurrent.singleton;

/**
 * @Author
 * @Description
 * @Date
 */
public class Singleton1 {
    //可以保证线程安全
    private static class Holder{
        private static Singleton1 singleton1 = new Singleton1();
    }

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        return Holder.singleton1;
    }

    public static void main(String[] args) {
        String str = "12345a67";
        String start = "0";
        String end = "9";
        int result = 0;
        int length = str.length();
        for (int i=0;i<length;i++) {
            char c = str.charAt(i);
            if ('0'<=c&&c<='9'){
                result = result*10+(c-'0');
            } else {
                throw new NumberFormatException(c+"不是数字！");
            }

        }
        System.out.println(result);
        int i=1234567895;
    }
}
