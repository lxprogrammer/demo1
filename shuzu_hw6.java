package com.heima.arry;

import java.util.Random;
import java.util.Scanner;

public class shuzu_hw6 {
    public static void main(String[] args) {
        int arr[] = {12,14,23,45,66,68,70,77,90,91};
        int brr[]=new int[11];
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入");
        int num=scan.nextInt();
        int index=0;
        for (int i = 0; i < arr.length; i++) {
             if (arr[i]<=num){
                 brr[i]=arr[i];
                 index++;
             }else{
                 brr[i+1]=arr[i];
             }
             brr[index]=num;
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }

    }
}
