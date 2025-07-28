package org.corejava.concepts.InstaProblems;

public class ReverseAString {

    public static void main(String[] args) {
        String text = "automation";
        String reversedText = "";

        for (int i=text.length()-1; i>=0; i--){
            reversedText += text.charAt(i);
        }

        System.out.println(reversedText);
    }

}
