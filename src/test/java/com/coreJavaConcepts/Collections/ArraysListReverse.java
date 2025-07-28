package com.coreJavaConcepts.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArraysListReverse {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        System.out.println(numbers);
        for(int i=0, j = numbers.size() - 1; i < j; i++, j-- ){
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(j));
            numbers.set(j, temp);
        }

        System.out.println("Reversed List: " + numbers);
    }

}
