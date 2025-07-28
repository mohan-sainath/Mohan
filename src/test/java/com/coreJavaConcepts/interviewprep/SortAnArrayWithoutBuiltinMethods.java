package com.coreJavaConcepts.interviewprep;

import java.util.ArrayList;

public class SortAnArrayWithoutBuiltinMethods {

    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<array.length -1 ; i++){
            for(int j = 0; j<array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int num : array){
            list.add(num);
        }
        System.out.println(list);

        }
    }


