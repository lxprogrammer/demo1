package com.heima.arry;
public class demo1_array {
    public static void main(String[] args) {
        int arr[] = new int[]{15,66,55,44,33};
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------");*/
        add(new int[]{15,66,55,44,33});
    }
    public static void add( int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                  int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
