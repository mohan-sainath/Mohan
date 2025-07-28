package org.corejava.concepts.InstaProblems;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        String str = "Automation Testing";
        int vowels=0;
        int consonants=0;

        for (char c : str.toCharArray()){
            if ("aeiouAEIOU".indexOf(c) != -1){
                vowels++;
            }
            else if (Character.isLetter(c)){
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }

}
