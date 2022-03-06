package com.heima.arry;

public class shuzu_hw4 {
    public static void main(String[] args) {
        int sum=0;
        double[] arr1 = {72, 89, 65, 87, 91, 82, 71, 93, 76, 70};
        for (int i = 0; i < arr1.length; i++) {
            sum+=arr1[i];
        }
        double pj=sum*1.0/arr1.length;
        System.out.print("总分是"+sum + " "+"平均分是"+pj);
    }
}
