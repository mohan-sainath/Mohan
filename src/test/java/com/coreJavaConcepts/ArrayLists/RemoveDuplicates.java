package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,4,3,1,5,6,7));
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int num : numbers){
            if(!uniqueList.contains(num)){
                uniqueList.add(num);
            }
        }
        System.out.println(uniqueList);
    }

}
