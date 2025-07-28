package org.corejava.concepts.InstaProblems;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        int num = 233;
        boolean isPrime = true;

        if (num <= 0){
            isPrime = false;
        }

        for (int i=2; i<num/2; i++){
            if (num % 2 == 0){
                isPrime= false;
                break;
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
