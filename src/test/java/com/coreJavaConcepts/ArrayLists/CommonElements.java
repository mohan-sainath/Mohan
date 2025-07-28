package com.coreJavaConcepts.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(30,40));

        ArrayList<Integer> common = new ArrayList<>();

        for(int num : al1){
            if(al2.contains(num) && !common.contains(num)){
                common.add(num);
            }
        }
        System.out.println(common);
    }

}
