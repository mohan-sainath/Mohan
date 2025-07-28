package org.corejava.concepts.InstaProblems;

public class Armstrong {

    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result = 0;
        while (original != 0){
            int digit = original % 10;
            result += Math.pow(digit,3);
            original /= 10;
        }
        System.out.println(result==num);
    }

}
