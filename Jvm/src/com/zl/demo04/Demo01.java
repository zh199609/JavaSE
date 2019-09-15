package com.zl.demo04;

/**
 * @ClassName: Demo01
 * @Description: TODO
 * @Author: Administrator
 * @Date: 2019/9/14 22:01
 * @Version: 1.0
 **/
/*
    参数：-verbose:gc -XX:PrintGCDetail
       对象优先在Eden上分配
     限定大小：-Xms20M -Xmx20M
 */
public class Demo01 {

    public static void main(String[] args) {
        byte[] bytes1 = new byte[1 * 1024 * 1024];
        byte[] bytes2 = new byte[4 * 1024 * 1024];
        byte[] bytes3 = new byte[1 * 1024 * 1024];
        byte[] bytes4 = new byte[4 * 1024 * 1024];
    }
}
