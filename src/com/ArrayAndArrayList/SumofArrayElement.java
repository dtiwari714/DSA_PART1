package com.ArrayAndArrayList;

public class SumofArrayElement {
    public static void main(String[] args) {
        int[] arr=new int[]{25,22,45,56};
        int sum=0;
        System.out.println("Sum of Array Element:");
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
