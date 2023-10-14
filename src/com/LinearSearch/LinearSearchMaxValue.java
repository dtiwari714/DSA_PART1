package com.LinearSearch;

public class LinearSearchMaxValue {
    public static void main(String[] args) {
        int[] nums={45,65,98,75};
        System.out.println("Biggest number in Array "+linearSearch(nums));
    }
    static int linearSearch(int[] arr){
        if(arr.length==0){
            System.out.println("Enter the value in Array");
        }
        int max=arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(arr[index]>max){
                max=arr[index];
                //System.out.println("Index of the maximum value in the Array "+index);
            }
        }
        return max;
    }
}
