package org.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex05 {

    public static void main(String[] args) {
        Stream<Person> ss = Stream.of(
                new Person(100,80,90),
                new Person(40,20,30),
                new Person(50,10,80)
        );
        ss.forEach(System.out::println);

        System.out.println();

        ss = Stream.of(
                new Person(100,80,90),
                new Person(40,20,30),
                new Person(50,10,80)
        );
        IntStream is = ss
                .flatMapToInt(s-> IntStream.of(s.getEng(),s.getKor(),s.getMath())
                );
//        System.out.println(is.sum());
        System.out.println(is.average());

    }
}
