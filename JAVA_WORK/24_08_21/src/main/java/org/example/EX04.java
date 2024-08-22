package org.example;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class EX04 {
    public static void main(String[] args) {

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        };
//        TreeSet<String> treeSet = new TreeSet<>();

        TreeSet<String> treeSet = new TreeSet<>((o1, o2) -> o2.length() - o1.length());

        treeSet.add("CCC");
        treeSet.add("A");
        treeSet.add("DDDD");
        treeSet.add("BB");

        System.out.println(treeSet);
    }
}