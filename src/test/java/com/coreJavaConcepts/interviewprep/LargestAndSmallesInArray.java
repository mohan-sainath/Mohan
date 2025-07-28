package com.coreJavaConcepts.interviewprep;

import java.lang.reflect.Array;

public class LargestAndSmallesInArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};

        int smallest = numbers[0];
        int largest = numbers[0];

        for(int num : numbers){
            if(num < smallest){
                smallest = num;
            }
            if (num > largest){
                largest = num;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }

}
