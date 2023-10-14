package com.FunctionsAndMethods;

import java.util.Scanner;

public class PrimeBetweenNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First number");
        int a=input.nextInt();
        System.out.println("Enter the Second number");
        int b= input.nextInt();
        for (int i = a; i <=b; i++) {
            if (prime(i)){
                System.out.println(i+" ");
            }

        }
    }
    public static boolean prime(int a) {
        int count = 0;
        int x=a/2;
        for (int i = 2; i <= x; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;


    }
    }

