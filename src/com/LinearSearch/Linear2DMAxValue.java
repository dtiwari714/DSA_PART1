package com.LinearSearch;

import java.util.Arrays;

public class Linear2DMAxValue {
    public static void main(String[] args) {
        int[][] nums=new int[][]{{45,65,98,23},{45,65,78},{12,13,45}};
        int target=23;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[][] arr,int target){
        if(arr.length==0){
            System.out.println("Array is Empty");
        }
        int max=arr[0][0];
        int min=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0;col <arr[row].length ;col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }
}
