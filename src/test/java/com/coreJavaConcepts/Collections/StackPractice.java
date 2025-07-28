package com.coreJavaConcepts.Collections;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.search(10));
        System.out.println(stack); //Full List - [10,20,30,40,50]
        System.out.println(stack.pop()); //Removing LIFO element- 50
        System.out.println(stack); //List after popping out - [10,20,30,40]
        System.out.println(stack.peek()); //Display last updated element - 40
        System.out.println(stack.empty());
        System.out.println(stack.search(30));
        System.out.println(stack.removeAll(stack));
        System.out.println(stack.empty());

    }

}
