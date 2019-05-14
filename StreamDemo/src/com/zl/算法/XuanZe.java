package com.zl.算法;

import java.util.Random;

public class XuanZe {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(20);
            //arr[i] = 10 - i;
        }
        System.out.print("排序前的数据：");
        show(arr);
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[temp] < arr[j + 1]) {
                    temp = j + 1;
                }
            }
            if (temp != i) {
                arr[temp] = arr[temp] + arr[i];
                arr[i] = arr[temp] - arr[i];
                arr[temp] = arr[temp] - arr[i];
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
