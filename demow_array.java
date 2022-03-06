package com.heima.arry;

public class demow_array {
    public static void main(String[] args) {
        int arr[] = new int[]{15,66,55,44,33};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println(sum*1.0/arr.length);

    }
}
