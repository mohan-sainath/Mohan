package com.coreJavaConcepts.interviewprep;

import com.coreJavaConcepts.Collections.LinkedListPractice;

public class PalindromeString {

    public static void main(String[] args) {
        String name = "Madam";
        boolean isPalindrome = true;

        name = name.toLowerCase();
        int length = name.length();

        for(int i=0; i<length/2; i++){
            if (name.charAt(i) != name.charAt(length - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

}
