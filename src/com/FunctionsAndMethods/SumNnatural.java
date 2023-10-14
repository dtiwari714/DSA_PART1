package com.FunctionsAndMethods;

import java.util.Scanner;

public class SumNnatural {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        sum(a);
    }
    public static void sum(int n){
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);

    }

}
