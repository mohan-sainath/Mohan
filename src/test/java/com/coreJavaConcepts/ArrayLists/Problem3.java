package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;

public class Problem3 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.remove("Green");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);
    }

}
