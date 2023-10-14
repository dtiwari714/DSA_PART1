package com.Condition_and_Loop;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= input.nextInt();
        /*for loop statement*/
//        for (int i=1;i<=num+1;i++){
//            System.out.println(i);
//        }
//      for (int i=1;i<=10;i++){
//           System.out.println(i);
//       }

        /*While loop statement*/
//        while (num==7){
//            for (int i=1;i<=num+1;i++){
//                System.out.println(i);
//            }
//        }

        /*Do while*/
        do{
            System.out.println(num);
            num++;
        }while (num<=7);
    }
}
