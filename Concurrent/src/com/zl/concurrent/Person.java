package com.zl.concurrent;

import sun.security.util.Length;

import java.util.Random;

/**
 * @Author
 * @Description
 * @Date
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws InterruptedException {
        final Person p=new Person();
        ThreadLocal<Person> threadLocal = new ThreadLocal<Person>() {
            public Person initialValue() {
                Person person = new Person();
                System.out.println("initialValue:"+person);
                return person;
                //return p;
            }
        };

        for (int i = 0; i < 30; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    String s = new Random().nextInt(100)+"";
                    threadLocal.get().setName(s);
                    System.out.println(threadLocal.get().getName()+"--"+threadLocal.get()+"--"+s);
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println("-----------------");
        System.out.println(threadLocal.get());



        String str = "I am a coder";
        int length = str.length();
        String s[] = new String[10];
        String ss = "";
        for(int i=0;i<length;i++){
            char c = str.charAt(i);

            if(!Character.isSpace(c)){
                ss= ss+c;
            } else {
                //把ss放到s数组中  ss清空
            }
        }


        System.out.println(Integer.valueOf(7).compareTo(Integer.valueOf("7")));
    }
    //deilaiwen 6300  xia 6300  kasha   6300    kate3




}
