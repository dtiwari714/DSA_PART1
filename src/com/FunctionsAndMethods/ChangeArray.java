package com.FunctionsAndMethods;

import java.sql.Array;
import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] num) {
        num[0]=99;
    }
}
