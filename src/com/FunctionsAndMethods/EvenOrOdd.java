package com.FunctionsAndMethods;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a=input.nextInt();
        evenorodd(a);
    }
    public static void evenorodd(int a){
            if (a%2==0){
                System.out.println("Entered number is "+a+" is Even");
            }
            else{
                System.out.println("Enter number is "+a+" is Odd");
            }
        }
    }
