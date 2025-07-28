package com.coreJavaConcepts.interviewprep;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 12321;
        int originalNumber = number;
        int reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number/10;
        }
        System.out.println(reversed);
        if (originalNumber == reversed){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
