package org.corejava.concepts.InterviewPreparation.Strings;

public class StringDecompression {

    public static void main(String[] args) {
        String str = "a2b2c1a3";
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i+=2){
            char ch = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i+1));
            for (int j=0; j<count; j++){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

}
