package com.FunctionsAndMethods;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //System.out.println("Enter The number1:");
        //int a= input.nextInt();
        //153
        // armstrong(a);
        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean armstrong(int n){
        int sum=0;
        int original=n;
        while(n>0){
            int num=n%10;
            int cube=num*num*num;
            sum=sum+cube;
            n=n/10;
        }
        //System.out.println(sum);
        return sum==original;
    }
}
