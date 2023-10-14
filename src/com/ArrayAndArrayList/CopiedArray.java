package com.ArrayAndArrayList;

public class CopiedArray {
    public static void main(String[] args) {
        int[] arr1=new int[]{45,65,87};
        int[] arr2=new int[]{89,98,23};
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+"  ");
        }
    }
}
