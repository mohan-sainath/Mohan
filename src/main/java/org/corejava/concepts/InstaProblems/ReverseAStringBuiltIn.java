package org.corejava.concepts.InstaProblems;

public class ReverseAStringBuiltIn {

    public static void main(String[] args) {
        String text = "Programming";
        StringBuilder reversed = new StringBuilder(text).reverse();
        System.out.println(reversed.toString());
    }

}
