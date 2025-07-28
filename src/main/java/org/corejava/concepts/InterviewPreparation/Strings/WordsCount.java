package org.corejava.concepts.InterviewPreparation.Strings;

import java.util.Arrays;

public class WordsCount {

    public static void main(String[] args) {
        String input = "Java is fun to learn";
        String[] words = input.trim().split("\\s+");
        int wordsCount = words.length;
        System.out.println(wordsCount);
    }

}
