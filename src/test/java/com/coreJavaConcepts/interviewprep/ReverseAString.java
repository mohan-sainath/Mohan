package com.coreJavaConcepts.interviewprep;

public class ReverseAString {

    public static void main(String[] args) {
        String name = "eerhS aynahD";
        String reverse = "";
        for(int i=name.length()-1; i>=0; i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);
    }
}
