package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(77,78,98,89,86,55,96));
        System.out.println(marks.reversed());
    }

}
