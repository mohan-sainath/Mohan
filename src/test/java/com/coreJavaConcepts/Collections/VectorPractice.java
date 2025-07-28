package com.coreJavaConcepts.Collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorPractice {

    public static void main(String[] args) {
        Object[] arr = new Object[] {1,2,3,4,5};

        Vector v1 = new Vector(Arrays.asList(arr));

        System.out.println(v1);

        v1.add(1, "Sai");

        System.out.println(v1);
    }

}
