package com.coreJavaConcepts.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysListPractice2 {

    public static void main(String[] args) {
        List<String> bikes = new ArrayList<>();

        bikes.add("Apache 350");
        bikes.add("Yamaha R15");
        bikes.add("Royal Enfield Classic 350");
        bikes.add("Kawasaki z900");
        bikes.add("Himalayan 411");

        for(String bike : bikes){
            System.out.print(bike + ", ");
        }

        bikes.remove("Apache 350");
        System.out.println("\n " +  bikes);

        bikes.add("Ktm Duke");
        System.out.println(bikes);

        Collections.sort(bikes);
        System.out.println(bikes);
    }

}
