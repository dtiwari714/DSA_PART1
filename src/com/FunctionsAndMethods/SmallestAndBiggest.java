package com.FunctionsAndMethods;

import java.util.Scanner;

public class SmallestAndBiggest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= input.nextInt();
        System.out.println("Enter the Second number:");
        int b= input.nextInt();
        System.out.println("Enter the Third number:");
        int c= input.nextInt();
        smallest(a,b,c);
        biggest(a,b,c);
    }
    public static void smallest(int a,int b,int c){
        int smallest=Math.min(c,Math.min(a,b));
        System.out.println("The Smallest number is "+smallest);
    }
    public static void biggest(int a,int b,int c){
        int biggest=Math.max(c,Math.max(a,b));
        System.out.println("The biggest number is "+biggest);
    }
}
