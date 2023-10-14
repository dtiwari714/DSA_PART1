package com.Condition_and_Loop;

public class Countnumber {
    public static void main(String[] args) {
        int a= 17779;
        int count=0;
        while (a>0){
            int num=a%10;
            if (num==7){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
}
