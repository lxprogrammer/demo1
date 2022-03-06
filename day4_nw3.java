package com.heima.arry;

import java.util.Scanner;

public class day4_nw3 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int newArr[] = new int[5];
        int num = 0;
        int index = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("输入5个数字");
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字");
            int in_to = scan.nextInt();
            arr[i] = in_to;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                num = arr[i];
                index++;
            } else {
                num = 0;
                index++;
            }
            newArr[i] = num;
            System.out.println(newArr[i]);
        }

    }
}
