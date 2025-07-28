package org.corejava.concepts.InterviewPreparation.Strings;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {


    public static void main(String[] args) {
        String input = "Hello World";
        input.toLowerCase();

        Map<Character, Integer> freqMap = new HashMap<>();
        char mostFreqChar = '\0';
        int countMax = 0;

        for (char c : input.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
            if (freqMap.get(c) > countMax){
                countMax = freqMap.get(c);
                mostFreqChar = c;
            }
        }

        if (mostFreqChar != '\0'){
            System.out.println(mostFreqChar);
            System.out.println(countMax);
        }
        else {
            System.out.println("No Valid character found");
        }

    }

}
