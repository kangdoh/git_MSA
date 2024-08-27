package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex05 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");

        String result = list.stream()
                .reduce("",(a,b)->{
                    if (a.length() > b.length()) return a;
                    else return b;
                });

        System.out.println(result);

//        result = list.stream().reduce("",(a, b)->);

    }

}