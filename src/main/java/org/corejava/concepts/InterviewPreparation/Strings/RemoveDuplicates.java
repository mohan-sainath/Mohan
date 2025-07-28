package org.corejava.concepts.InterviewPreparation.Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "Programming";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()){
            if (set.add(c)){
                result.append(c);
            }
        }
        return result.toString();
    }

}
