package com.heima.arry;

import java.util.Random;

public class homeWork5 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int count=0;
        int sum=0;
        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            int r1 = r.nextInt(101) ;
            arr1[i] = r1;
            sum+=arr1[i];
            if (arr1[i]>=60) {
                count++;
            }
        }
        double pj=sum*1.0/(arr1.length);
        System.out.println("及格的人数:"+count);
        System.out.println("平均分:"+pj);
        System.out.println("总分:"+sum);

    }
}
