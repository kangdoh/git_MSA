package org.example;

import java.util.stream.IntStream;

public class ex02 {
    public static void main(String[] args) {
        IntStream.of(11,22,33,44,55)
                .forEach(s->System.out.println(s));

        System.out.println();

        IntStream.range(5,10)
                .forEach(System.out::println);

        System.out.println();

        IntStream.rangeClosed(5,10)
                .forEach(System.out::println);

    }
}
