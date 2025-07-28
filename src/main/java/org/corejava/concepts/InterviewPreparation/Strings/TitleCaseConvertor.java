package org.corejava.concepts.InterviewPreparation.Strings;

public class TitleCaseConvertor {

    public static void main(String[] args) {
        String input = "java is fun";
        String[] words = input.toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            if (word.length() > 0){
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        System.out.println(result);
    }

}
