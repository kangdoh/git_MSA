package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex01 {

    public static void main(String[] args) {
        Stream.of(11,22,33,44,55,66,77,88,99)
                .forEach(System.out::println);

        Stream.of("asdfasdfas","asdfasdf")
                .forEach(System.out::println);

        List<String> list1 = Arrays.asList("11","22","33","44");
        List<String> list2 = Arrays.asList("11","22","33","44");

//        Stream.of(list1, list2)
//                .flatMapToInt(String ->
//                        )





    }
}