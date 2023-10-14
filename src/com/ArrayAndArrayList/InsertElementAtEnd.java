package com.ArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtEnd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=input.nextInt();
        int[] arr=new int[size+1];
        for (int i = 0; i < size; i++) {
            arr[i]=input.nextInt();
        }
//        System.out.println("Enter the value to enter at the End");
//        arr[size]=input.nextInt();

//        System.out.println("After Adding one number at end");
//        for (int i = 0; i < size+1; i++) {
//            System.out.println(arr[i]);
//       }
        System.out.println("After adding one number at beginning");
        for (int i = size; i >0 ; i--) {
            arr[i]=arr[i-1];
            System.out.println(arr[i]);
        }
        System.out.println("Enter the value to enter at the beginning");
        arr[0]=input.nextInt();
        for (int i = 0; i <=size; i++) {
            System.out.println(arr[i]);
        }
    }
}
