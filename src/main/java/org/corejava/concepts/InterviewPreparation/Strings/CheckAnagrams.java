package org.corejava.concepts.InterviewPreparation.Strings;

import java.util.Arrays;

public class CheckAnagrams {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = true;

        if (str1.length() != str2.length()){
            isAnagram = false;
        }

        char ch1[] = str1.toLowerCase().toCharArray();
        char ch2[] = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(isAnagram);
    }

}
