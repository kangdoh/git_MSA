package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class EX01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Box");
        set.add("Box");
        set.add("Boxxx");
        set.add("Toy");
        set.add("RoBot");

        System.out.println(set);


        System.out.println("Box".hashCode());
        System.out.println(new String("Box").hashCode());

        System.out.println(new Member().hashCode());
        System.out.println(new Member().hashCode());
    }



}