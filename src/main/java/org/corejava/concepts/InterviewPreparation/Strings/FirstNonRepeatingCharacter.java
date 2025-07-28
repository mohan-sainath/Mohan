package org.corejava.concepts.InterviewPreparation.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String str) {

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "aabbcddeeeff";
        char result = findFirstNonRepeatingCharacter(input);

        if (result != '\0'){
            System.out.println(result);
        }
        else {
            System.out.println("Not found");
        }
    }

}
