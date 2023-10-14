package com.ArrayAndArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr=new int[]{45,65,74,87};
        int n=arr.length;
        int[] temp=new int[n];
        int tempvar=arr.length;
        for (int i = 0; i < arr.length; i++) {
            temp[tempvar-1]=arr[i];
            tempvar=tempvar-1;
        }
        System.out.println();
        System.out.println("Using the temp variable");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(+temp[i]+" ");
        }
        System.out.println();
        System.out.println("Without using the temp variable");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}
