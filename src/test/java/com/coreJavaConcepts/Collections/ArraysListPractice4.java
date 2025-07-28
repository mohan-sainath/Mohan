package com.coreJavaConcepts.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListPractice4 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> newElements = List.of(1,2,3,4,5,6);
        numbers.addAll(newElements);
        System.out.println(numbers);
    }
}
