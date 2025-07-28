package com.coreJavaConcepts.interviewprep;

public class ReverseASentence {

    public static void main(String[] args) {
        String sentence = "Hey Folks ! Good Morning";
        String[] words = sentence.split(" ");
        String reversedSentence = "";

        for (int i= words.length-1; i>=0; i--){
            reversedSentence += words[i] + " ";
        }
        System.out.println(reversedSentence);
    }
}
