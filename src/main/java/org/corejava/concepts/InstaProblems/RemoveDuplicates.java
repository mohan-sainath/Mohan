package org.corejava.concepts.InstaProblems;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,4,3,53,22,43,2,4,2,5,6};
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }
        System.out.println(set);
    }

}
