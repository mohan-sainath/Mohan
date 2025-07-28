package com.coreJavaConcepts;

public class Program1 {

    public static int reduceToSingleDigit(int num) {
        while (num > 9) {
            int temp = 0;
            while (num > 0) {
                temp += num % 10;
                num /= 10;
            }
            num = temp;
        }
        return num;
    }

    public static void main(String[] args) {
        String input = "222.8888.99999";
        String[] parts = input.split("\\.");

        for(String part : parts){
            int sum = 0;
            for(char ch : part.toCharArray()){
                sum += Character.getNumericValue(ch);
            }
            int reducedNum = reduceToSingleDigit(sum);
            System.out.println(reducedNum);
        }
    }
}
