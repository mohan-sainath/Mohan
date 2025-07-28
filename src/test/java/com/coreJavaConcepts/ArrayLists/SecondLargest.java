package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(75,76,85,87,98,99,100));
        Collections.sort(marks);
        marks.removeLast();
        System.out.println(marks.getLast());
    }

}
