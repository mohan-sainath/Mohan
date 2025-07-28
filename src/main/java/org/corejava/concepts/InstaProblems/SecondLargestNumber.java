package org.corejava.concepts.InstaProblems;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] array = {1,2,3,432,4324,312,515};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : array){
            if (num > first){
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println(second);

    }

}
