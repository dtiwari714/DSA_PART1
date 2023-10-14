package com.FunctionsAndMethods;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a= input.nextInt();
        palindrome(a);
    }
    public static void palindrome(int a){
        int num;
        int original=a;
        int count=0;
        while(original>0){
            num=original%10;
            original=original/10;
            count=count*10+num;
        }
        if (count==a){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

    }
}
