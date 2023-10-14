package com.ArrayAndArrayList;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{25,65,14,45};
        int secondmax=arr[0];
        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println();
        for (int j = arr.length-2; j >=0; j--) {
            if(arr[j]>secondmax){
                secondmax=arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The second Largest of given Array:"+secondmax);
    }
}
