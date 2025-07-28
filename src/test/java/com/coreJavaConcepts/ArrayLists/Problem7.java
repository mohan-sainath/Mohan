package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem7 {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(70,80,90,100));
        System.out.println(Collections.max(scores));
        System.out.println(Collections.min(scores));
    }

}
