package com.ArrayAndArrayList;

public class NegativeElement {
    public static void main(String[] args) {
        int[] arr1= new int[]{45, -65, 45, -12};
        int negativeElement=0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]<0){
                System.out.println(arr1[i]);
                negativeElement++;
            }
        }
        System.out.println("The negative element in array is "+negativeElement);
    }
}
