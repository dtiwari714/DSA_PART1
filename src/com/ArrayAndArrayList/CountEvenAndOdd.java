package com.ArrayAndArrayList;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Size of Array:");
        int num=input.nextInt();
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        int evencount=0;
        int oddcount=0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i]%2==0){
                    evencount++;
                }
                else{
                    oddcount++;
                }

            }
            System.out.println("Total number of even number is "+evencount+" OddNumber is "+oddcount);
        }

    }
