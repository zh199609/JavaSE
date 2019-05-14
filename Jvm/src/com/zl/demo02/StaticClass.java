package com.zl.demo02;

import java.util.*;

public class StaticClass {
    private String name;

    public void test() {
        inner inner = new inner();
        inner.age = "10";
    }

    public  static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("fsdf");

        List arrayList = new ArrayList();
        arrayList.add("sdf");


        List strings = new ArrayList<String>();


        Set<String> set = new HashSet<>();
        set.add("f");



    }

    public void listGenicTest(List<?> list){
        Object o = list.get(0);

    }




    static class inner {
        private String age;

        public  void test01() {
            System.out.println(this.age);
        }

    }
}
