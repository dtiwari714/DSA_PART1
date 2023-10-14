package com.Condition_and_Loop;

public class Factor {
    public static void main(String[] args) {
        int num=45;
        for (int i = 1; i <=num; i++) {
            if (num%i==0){
                System.out.println(i);
            }
        }
    }
}
