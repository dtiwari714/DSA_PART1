package com.LinearSearch;

import java.util.Arrays;

public class LinearSearchBetweenArray {
    public static void main(String[] args) {
        int[] num={45,65,78,98,78,63,78};
        int target=98;
        int ans=linearSearch(num,target,2,5);
        System.out.println(ans);
    }
    public static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return 0;
        }
        for (int index = start; index <end ; index++) {
            int element=arr[index];
            if (element==target)
            {
            System.out.println("Index of your Element is "+index);
            }
            else{
                System.out.println("Your element is not present in the Array");
            }
        }
        return target;
    }
}
