package com.LinearSearch;

import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;

public class Linear2D_SearchArray {
    public static void main(String[] args) {
        int[][] nums=new int[][]{{45,65,98,23},{45,65,78},{12,13,45}};
        int target=23;
        int[] ans=linearSearch(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] linearSearch(int[][] arr,int target){
        if(arr.length==0){
            System.out.println("Array is Empty");
        }
        int max=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0;col <arr[row].length ;col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return new int[]{-1,-1};
    }
}
