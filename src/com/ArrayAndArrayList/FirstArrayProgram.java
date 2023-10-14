package com.ArrayAndArrayList;

public class FirstArrayProgram {
    public static void main(String[] args) {
        int[][] arr=new int[5][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
