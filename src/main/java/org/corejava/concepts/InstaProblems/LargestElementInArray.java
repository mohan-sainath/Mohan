package org.corejava.concepts.InstaProblems;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,43,556,324,1442,133};
        int largest = arr[0];
        int smallesr = arr[0];
        for (int num : arr){
            if (num > largest){
                largest = num;
            }
            if (num < smallesr) {
                smallesr = num;
            }
        }
        System.out.println(largest);
        System.out.println(smallesr);
    }

}
