package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;

public class Problem4 {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(99);
        marks.add(0,89);
        marks.add(75);
        marks.add(100);

        for(int i=0; i< marks.size(); i++){
            if (marks.get(i) > 95) {
                System.out.println(marks.get(i));
            }
        }

        for(int mark : marks){
            System.out.println(mark);
        }
    }

}
