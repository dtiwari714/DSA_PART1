package com.Condition_and_Loop;

import java.util.Scanner;

public class Fibonnachi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int a=0;
        int b=1;
        int count=2;
//        System.out.println("0");
//        System.out.println("1");
//        for (int i=a;i<=num;i++){
//            num=a+b;
//            System.out.println(num);
//            a=b;
//            b=num;
//        }
        while(count<=num){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);

    }
}
