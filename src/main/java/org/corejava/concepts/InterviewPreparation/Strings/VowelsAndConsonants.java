package org.corejava.concepts.InterviewPreparation.Strings;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        String input = "Hello World";
        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase();
        for (char c : input.toCharArray()){
            if (Character.isLetter(c)){
                if (c == 'a' || c == 'e' || c=='i' || c=='o' || c=='u'){
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
