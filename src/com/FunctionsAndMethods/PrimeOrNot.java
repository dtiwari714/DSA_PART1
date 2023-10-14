package com.FunctionsAndMethods;

public class PrimeOrNot {
    public static void main(String[] args) {
        isprime(11);
    }
    public static void isprime(int a){
        int count=0;
        for (int i = 1; i <=a; i++) {
           if (a%i==0){
               count++;
           }
        }
        if (count==2){
            System.out.println("It is Prime");
        }
        else{
            System.out.println("It is not Prime");
        }
    }
}
