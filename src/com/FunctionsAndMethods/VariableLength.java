package com.FunctionsAndMethods;

import java.util.Arrays;

public class VariableLength {//...v is not fixed length
    public static void main(String[] args) {
        fun(89,78,656,454);
        multiple(78,89,78,45,78,46);
    }
    public static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void multiple(int a,int b,int ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
}
