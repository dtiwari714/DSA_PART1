package com.FunctionsAndMethods;

public class PassValue {
    public static void main(String[] args) {
        int sum=sum1(4,5);
        System.out.println("Total value is : "+sum);
    }
    public static int sum1(int a,int b){
       int total=a+b;
        return total;
    }
}
