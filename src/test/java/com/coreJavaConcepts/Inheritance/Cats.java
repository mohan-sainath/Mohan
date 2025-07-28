package com.coreJavaConcepts.Inheritance;

public class Cats extends Animal{

    @Override
    public void cat(){
        System.out.println("Cat sounds like Meowww...");
    }

    public static void main(String[] args) {
        Animal animal= new Cats();
        animal.cat();
    }

}
