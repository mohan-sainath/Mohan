package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem6 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Delhi", "Hyderabad", "Bengaluru", "Chennai"));
        if (cities.contains("Bengaluruu")){
            System.out.println("Bengaluru is an amazing city with cool weather");
        }
        else{
            System.out.println("City doesn't exist in the List");
        }
    }

}
