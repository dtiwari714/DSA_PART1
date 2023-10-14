package com.ArrayAndArrayList;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num=input.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Length of array is "+arr.length);

    }
}
