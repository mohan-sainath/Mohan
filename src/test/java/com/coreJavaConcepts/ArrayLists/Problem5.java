package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem5 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Zoya", "Alice", "Bob", "John", "David"));
        Collections.sort(names);
        System.out.println(names);
    }

}
