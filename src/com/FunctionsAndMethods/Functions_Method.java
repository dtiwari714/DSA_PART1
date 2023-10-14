package com.FunctionsAndMethods;

import java.util.Scanner;

public class Functions_Method {
    public static void main(String[] args) {
        sum1();
        int total=sum2();
        System.out.println("Total of sum of two number is "+total);
    }
    static int sum2(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number1:");
        int num1= input.nextInt();
        System.out.print("Enter the Number2:");
        int num2= input.nextInt();
        int sum=num1+num2;
        return sum;

    }

    public static void sum1() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number1:");
        int num1= input.nextInt();
        System.out.print("Enter the Number2:");
        int num2= input.nextInt();
        int sum=num1+num2;
        System.out.println("Sum of Two number:"+sum);
    }
}
