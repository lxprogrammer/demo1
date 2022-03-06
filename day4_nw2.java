package com.heima.arry;
public class day4_nw2 {
    public static void main(String[] args) {
        int [] arr = {1,3,-1,5,-2};
        int[] arr1 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if (arr[i]<=0){
                arr[i]=0;
            }
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[arr1.length-1-i];
            System.out.print(arr1[i]+" ");
        }

    }
}
