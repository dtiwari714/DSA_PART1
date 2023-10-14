package com.Condition_and_Loop;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a= input.nextInt();
        System.out.println("Enter the value of B");
        int b= input.nextInt();
        System.out.println("Enter the value of C");
        int c= input.nextInt();

//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
        int max=Math.max(c,Math.max(a,b));

        System.out.println(max);

    }
}
