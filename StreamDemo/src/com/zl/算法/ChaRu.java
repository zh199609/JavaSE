package com.zl.算法;

import java.util.Random;
import java.util.logging.Level;

public class ChaRu {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(20);
            //arr[i] = 10 - i;
        }
        System.out.print("排序前的数据：");
        show(arr);

        int j;
        int target;
        for (int i = 1; i < arr.length; i++) {
            j = i;
            target = arr[i];
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
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
