package com.FunctionsAndMethods;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
//        int exchage=swap(4,7);
//        System.out.println(exchage);
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
//        return a;

    }

}
