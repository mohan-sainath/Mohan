package com.coreJavaConcepts.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArraysPracticeReplaceColours {

    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("Green");
        colours.add("Red");
        colours.add("Black");
        colours.add("Yellow");

        colours.replaceAll(colour -> colour.equals("Red") ? "Violet" : colour);

        System.out.println(colours);
    }

}
