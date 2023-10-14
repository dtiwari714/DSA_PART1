package com.LinearSearch;

public class LinearSearchInteger {
    public static void main(String[] args) {
        int[] nums={45,98,65,87};
        int target=65;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[]arr,int target){
        if (arr.length==0){
            System.out.println("Your Enter is Empty");
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if (element==target){
                System.out.println("Target at index "+index);
            }
        }
        return target;
    }
}
