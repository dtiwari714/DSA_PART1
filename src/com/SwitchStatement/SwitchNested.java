package com.SwitchStatement;

import java.util.Scanner;

public class SwitchNested {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int EmpID= input.nextInt();
        String Name= input.next();
        switch(EmpID){
            case 1:
                System.out.println("welcome"+Name);
                break;
            case 2:
                System.out.println("Welcome"+Name);
                break;
            case 3:
                switch (Name) {
                    case "Rahul" -> System.out.println("Computer");
                    case "Raj" -> System.out.println("camera");
                    default -> System.out.println("No name");
                }
            break;
            default:
                System.out.println("End part 2");
        }
    }
}
