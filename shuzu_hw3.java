package com.heima.arry;

import java.util.Random;

public class shuzu_hw3 {
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        int count=0;
        int sum=0;
        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            int r1 = r.nextInt(100) ;
            arr1[i] = r1;
            sum+=arr1[i];
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println(sum);

    }
}

