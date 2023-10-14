package com.ArrayAndArrayList;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr=new int[]{25,45,65,25};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            else {
                min = arr[i];
            }
        }
        System.out.println("Max number is "+max+" Min is "+ min);
    }
}
