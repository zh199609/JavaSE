package com.zl.concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @Author
 * @Description
 * @Date
 */
public class test {


    public static void main(String[] args) {
        k();
    }

    public static void k() {
        // ----------------------------initMap----------------------------------------
        ConcurrentHashMap<String, Object> map1 = new ConcurrentHashMap<>();
        HashMap<String, Object> map2 = new HashMap<>();
        String removeKey = "key2";
        Map<String, Object> map3 = Collections.synchronizedMap(new HashMap<>());
        String[][] arr = {{"key1", "value1"}, {"key2", "value2"}, {"key3", "value3"}};
        for (String[] strings : arr) {
            map1.put(strings[0], strings[1]);
            map2.put(strings[0], strings[1]);
            map3.put(strings[0], strings[1]);
        }
        // -----------------------------Test---------------------------------------
        /*try {
            test(map1, removeKey, "mp1");
        } catch (Exception e) {
            System.err.println("ConcurrentHashMap并发异常");
            e.printStackTrace();
        }*/
        try {
            test(map2, removeKey, "map2");
        } catch (Exception e) {
            System.err.println("HashMap并发异常");
            e.printStackTrace();
        }
        /*try {
            test(map2, removeKey, "map3");
        } catch (Exception e) {
            System.err.println("Collections.synchronizedMap并发异常");
            e.printStackTrace();
        }*/
    }

    public static void test(Map<String, Object> map, String removeKey, String mapName) {
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.err.println(t.getName() + "发生异常，key:" + removeKey);
            e.printStackTrace();
        });
        CountDownLatch ct = new CountDownLatch(1);
        Thread thread1 = new Thread(() -> {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    ct.await();
                } catch (InterruptedException e) {
                }
                System.out.println("Map:" + mapName + "、key:" + entry.getKey() + "、value:" + entry.getValue());
            }
        });
        thread1.setName("thread-for-" + mapName);
        thread1.start();
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
            map.remove(removeKey);
            System.out.println(mapName + "删除key，休眠3秒");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            ct.countDown();
            System.out.println(mapName + "休眠完毕，继续遍历");
        });
        thread2.setName("thread-remove-" + mapName);
        thread2.start();

        Thread thread3 = new Thread(() -> {
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            map.forEach((k, v) -> {
                System.out.println("最终遍历:" + mapName + "、key:" + k + "、value:" + v);
            });

        });
        thread3.start();

    }


}
