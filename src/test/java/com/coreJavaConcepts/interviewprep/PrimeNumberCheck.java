package com.coreJavaConcepts.interviewprep;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int num = 4;
        boolean isPrime = true;

        while (num <= 0){
            isPrime = false;
        }

        for(int i=1; i<num/2 ; i++ ){
            if (num % 2 == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }

}
