package com.coreJavaConcepts.Collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorPractice3 {


    public static void main(String[] args) {

        Object[] arr = new Object[]{1,2,3,4,5};
        Vector<Integer> v1 = new Vector<>();
        v1.add(12);
        v1.add(null);
        v1.add(null);
        v1.add(12);

        System.out.println(v1);
    }
}
