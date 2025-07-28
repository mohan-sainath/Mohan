package com.coreJavaConcepts.interviewprep;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int firstNumber = 102;
        int secondNumber = 292;

        System.out.println("Before Swapping, First Number is : " + firstNumber + " and Second number is : " + secondNumber);
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("After  Swapping, First Number is : " + firstNumber + " and Second number is : " + secondNumber);
    }

}
