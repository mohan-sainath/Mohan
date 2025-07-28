package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem8 {

    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Elephant"};
        ArrayList<String> animalsList = new ArrayList<>(Arrays.asList(animals));
        animalsList.add("Lion");
        System.out.println(animalsList);
    }

}
