package com.coreJavaConcepts.interviewprep;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String text = "Java is Awesome";
        String noSpace = text.replaceAll(" ", "");
        System.out.println("\"" + noSpace + "\"");

        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()){
            if (!Character.isWhitespace(ch)){
                sb.append(ch);
            }
        }
        System.out.println("\"" + sb.toString() + "\"");
    }

}
