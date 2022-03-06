package com.heima.arry;

import java.util.Random;

public class homeWork4 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            int r1 = r.nextInt(31) + 50;
            arr1[i] = r1;
            if (arr1[i] / 10 != 7 && arr1[i] % 10 != 7) {
                System.out.println("满足的数字有:" + arr1[i]);
            }
        }


    }
}
