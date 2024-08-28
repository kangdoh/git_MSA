package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ex06 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaabbb", "bbb", "ccc");
//        list = new ArrayList<>(list);
        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        System.out.println();
        list.stream().map(s -> s.replace("bbb", "AAdsdsd")).forEach(System.out::println);
        System.out.println();
        list.stream().map(s -> s.length()).forEach(System.out::println);




        //Optional의 map는 orelse 사용가능
        Optional<String> os1 = Optional.of("abCD efg");
        Optional<String> os2 = os1.map(s->s.toUpperCase());

        System.out.println(os2);
        System.out.println(os2.get());

        Optional<String> os3 = os1.map(s -> s.replace("",""))
                .map(s -> s.toUpperCase());

        System.out.println(os3);
        System.out.println(os3.get());
    }
}
