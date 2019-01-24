package com.zl.concurrent.singleton;

/**
 * @Author
 * @Description
 * @Date
 */
public class Singleton2 {
    //使用volatile关键字防止重排序，因为 new Instance()是一个非原子操作，可能创建一个不完整的实例
    private static volatile Singleton2 singleton2;

    private Singleton2() {
        /*为了在保证单例的前提下提高运行效率，我们需要对 singleton3 进行第二次检查，
        目的是避开过多的同步（因为这里的同步只需在第一次创建实例时才同步，一旦创建成功，
        以后获取实例时就不需要同步获取锁了）。这种做法无疑是优秀的，但是我们必须注意一点：
　　    必须使用volatile关键字修饰单例引用。*/
    }

    public static Singleton2 getInstance(){
        if (singleton2==null){
            synchronized (Singleton2.class) {
                // 只需在第一次创建实例时才同步
                if (singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
