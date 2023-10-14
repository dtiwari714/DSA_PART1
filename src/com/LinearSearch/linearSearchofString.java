package com.LinearSearch;

import java.util.Arrays;

public class linearSearchofString {
    public static void main(String[] args) {
        String word="Durgesh";
        char target='u';
        System.out.println(Arrays.toString(word.toCharArray()));
        System.out.println(linearSearch(word,target));
    }
    static boolean linearSearch(String str, char target){
        if (str.length()==0){
            return false;
        }
        //Arrays.toString(str.toCharArray());
//        for (char index = 0; index < str.length(); index++) {
//            if (target==str.charAt(index)){
//                System.out.println("Your character is "+str.charAt(index));
//                return true;
//            }
//        }
        for (char ch:str.toCharArray()) {
            if (ch==target){
                System.out.println("Your character is "+target);
                return true;
            }
        }
        return false;
    }
}
