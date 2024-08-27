package org.example;
import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        String []arr = new String[]{"a","b","c"};

        showAll(arr);

        showAll("Test");
        showAll("Test", "AAA");
        showAll("Test", "AAA", "BBB");
    }
    public static void showAll(String... args){
        System.out.println(Arrays.toString(args));
    }



}