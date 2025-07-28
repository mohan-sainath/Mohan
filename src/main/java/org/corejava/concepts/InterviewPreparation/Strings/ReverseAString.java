package org.corejava.concepts.InterviewPreparation.Strings;

public class ReverseAString {

    public static void main(String[] args) {
        String actualString = "Automation";
        String reversedString = "";
        for (int i = actualString.length()-1; i>=0; i--){
            reversedString += actualString.charAt(i);
        }
        System.out.println(reversedString);
    }

}
