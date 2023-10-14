package com.Condition_and_Loop;

public class Reverse {
    public static void main(String[] args) {
        int a=1534;
        int count=0;
//        while (a>0){
//            int num=a%10;
//            System.out.print(num);
//            count++;
//            a=a/10;
//        }
        while (a>0){
            int rem=a%10;
            a=a/10;
            count=count*10+rem;
        }
        System.out.println(count);
    }
}
