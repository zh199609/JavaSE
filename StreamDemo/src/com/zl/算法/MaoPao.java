package com.zl.算法;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MaoPao {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            //arr[i] = random.nextInt(20);
            arr[i] = 10 - i;
        }
        System.out.print("排序前的数据：");
        show(arr);
        boolean flag;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = true;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j + 1] > arr[i]) {
                    arr[j + 1] = arr[i] + arr[j + 1];
                    arr[i] = arr[j + 1] - arr[i];
                    arr[j + 1] = arr[j + 1] - arr[i];
                    flag = false;
                }
            }
            System.out.println("第%s次循环" + i);
            if (flag) {
                break;
            }
        }

        System.out.print("排序后的数据：");
        show(arr);
    }

    public static void show(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
