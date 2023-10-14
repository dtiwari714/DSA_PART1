package com.FunctionsAndMethods;

public class Factorial {
    public static void main(String[] args) {
        factorial(5);
    }
    public static void factorial(int a){
        int fact=1;
        for (int i = 1; i <= a; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
