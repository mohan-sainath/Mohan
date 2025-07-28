package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPalindrome {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,2,1,4));
        boolean isPalindrome = true;
        for(int i=0, j= numbers.size()-1; i<j; i++, j--){
            if (!numbers.get(i).equals(numbers.get(j))){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }

}
