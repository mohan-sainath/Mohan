package com.coreJavaConcepts.interviewprep;

public class VowelsConsonants {

    public static void main(String[] args) {
        String name = "Mohan Sainath";
        int consonantsCount = 0;
        int vowelsCount = 0;
        for (char ch : name.toCharArray()){
            if (Character.isLetter(ch)){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                }else {
                    consonantsCount++;
                }
            }
        }
        System.out.println(vowelsCount);
        System.out.println(consonantsCount);
    }

}
