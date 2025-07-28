package com.coreJavaConcepts.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArraysPracticeCheckElements {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mohan");
        names.add("Sai");
        names.add("Kanishka");
        names.add("Joshika");
        names.add("Prajna");

        String searchName = "Mohan";
        if(names.contains(searchName)){
            System.out.println(searchName + " is in the list");
        }
        else{
            System.out.println(searchName + " is not in the List");
        }

        int index = names.indexOf(searchName);
        System.out.println(index);
    }

}
