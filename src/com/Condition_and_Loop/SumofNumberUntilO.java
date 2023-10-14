package com.Condition_and_Loop;

import java.util.Scanner;

public class SumofNumberUntilO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int number;
        do {
            System.out.println("Enter number or press 0 to Exit:");
            number= input.nextInt();
            sum=sum+number;
        }while(number!=0);
        System.out.println("Sum of the Entered nuber is"+sum);

    }
}
