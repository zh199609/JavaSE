package com.zl.demo05;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @ClassName: ClassLoaderDemo
 * @Description: TODO
 * @Author: Administrator
 * @Date: 2019/9/22 14:25
 * @Version: 1.0
 **/
public class ClassLoaderDemo {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                System.out.println(fileName);
                InputStream resource = getClass().getResourceAsStream(fileName);
                if (resource == null) {
                    return super.loadClass(name);
                }
                try {
                    byte[] buff = new byte[resource.available()];
                    int read = resource.read(buff);
                    return defineClass(name, buff, 0, buff.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException();
                }
            }
        };
        Object clazz = classLoader.loadClass("com.zl.demo05.ClassLoaderDemo").newInstance();
        System.out.println(clazz.getClass());


    }
}
