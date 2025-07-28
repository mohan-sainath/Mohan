package com.coreJavaConcepts.Collections;

import java.util.Collections;
import java.util.*;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        List<String> playList = new ArrayList<>();
        playList.add("Song 1");
        playList.add("Song 2");
        playList.add("Song 3");

        Collections.shuffle(playList);

        System.out.println(playList);

        playList.remove("Song 2");
        Collections.shuffle(playList);
        System.out.println(playList);


        Vector v1 = new Vector();
        v1.add("Sai");
        v1.add("Kanish");
        v1.add(1,"Prajju");

        Vector v2 = new Vector();
        v2.add("Joshika");
        v2.add("Dhanya Shree");

        System.out.println(v1);

        v1.addAll(v2);

        System.out.println(v1);

        v1.removeAll(v2);

        System.out.println(v1);

        v1.set(1,"Prajna");

        System.out.println(v1);

        System.out.println(v1.lastElement());

        Object[] obj = v1.toArray();

        System.out.println(Arrays.toString(obj));
    }

}
