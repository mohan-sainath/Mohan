package org.corejava.concepts.InstaProblems;

public class Palindrome {

    public static void main(String[] args) {

        String str = "malayalam";
        String palindrome = "";

        for (int i=str.length()-1; i>=0; i--){
            palindrome += str.charAt(i);
        }
        if (palindrome.equals(str)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

}
