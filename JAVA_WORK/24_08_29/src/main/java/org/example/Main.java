package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().forEach(s->System.out.println(s));

        int result = list.stream().mapToInt(value -> value).sum();
        System.out.println("result ="+result);

        result = list.stream()
                .filter(integer -> integer%2==0)
                .reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println("result ="+result);
    }

}