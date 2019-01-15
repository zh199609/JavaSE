package com.zl.concurrent;

import org.junit.Test;

/**
 * @Author
 * @Description
 * @Date
 */
public class ThreadLocalTest {

    ThreadLocal<Long> longLocal = new ThreadLocal<Long>(){


    };
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();

    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest test = new ThreadLocalTest();
        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());
        for (int i = 0; i < 3; i++) {

        }
        // 在这里新建了一个线程
        Thread thread1 = new Thread() {
            public void run() {
                test.set(); // 当这里调用了set方法，进一步调用了ThreadLocal的set方法是，会将ThreadLocal变量存储到该线程的ThreadLocalMap类型的成员变量threadLocals中，
                // 注意的是这个threadLocals变量是Thread线程的一个变量，而不是ThreadLocal类的变量。
                System.out.println(test.getLong());
                System.out.println(test.getString());
            };
        };
        thread1.start();
        thread1.join();

        System.out.println(test.getLong());
        System.out.println(test.getString());


    }
    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }



    /**************************************/

    @Test
    public void test1() throws InterruptedException {
        System.out.println("Map的key是ThreadLocal类的实例对象，value为用户的值，并不是网上大多数的例子key是线程的名字或者标识。");
        Person person = new Person();
        System.out.println("new person:"+person);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocal<Person> threadLocal = new ThreadLocal<>();
                System.out.println(threadLocal);
                threadLocal.set(person);
                System.out.println(threadLocal.get());
                threadLocal.remove();
            }
        });
        thread.start();
        thread.sleep(1000);

    }
}
