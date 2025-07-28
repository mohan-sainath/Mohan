package com.coreJavaConcepts.interviewprep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInAString {

    public static void main(String[] args) {
        String text = "Alphonso Mango";
        text = text.toLowerCase();

        Map<Character, Integer> count = new HashMap<>();
        for (char c: text.toCharArray()){
            if (Character.isLetter(c)){
                count.put(c, count.getOrDefault(c,0) + 1);
            }
        }

        System.out.println("Duplicates in the String:");
        for (Map.Entry<Character, Integer> entry : count.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

}
