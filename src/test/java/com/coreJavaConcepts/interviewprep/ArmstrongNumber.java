package com.coreJavaConcepts.interviewprep;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(originalNumber).length();

        while (number != 0){
            int digit = number % 10;
            result += Math.pow(digit,digits);
            number /= 10;
        }
        if (result == originalNumber){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }

}
