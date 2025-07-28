package org.corejava.concepts.InterviewPreparation.Strings;

public class PalindromeCheck {

    public static void main(String[] args) {
        String input = "malayalam";
        String output = "";
        for (int i=input.length()-1; i>=0; i--){
            output += input.charAt(i);
        }
        if (input.equals(output)){
            System.out.println("It's a palindrome");
        }
        else {
            System.out.println("It's not Palindrome");
        }
    }

}
