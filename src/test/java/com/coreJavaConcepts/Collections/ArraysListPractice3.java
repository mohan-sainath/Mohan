package com.coreJavaConcepts.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListPractice3 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,6,7));
        System.out.println(numbers.get(8));
    }
}
