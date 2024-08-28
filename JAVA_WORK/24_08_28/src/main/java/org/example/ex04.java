package org.example;

import java.util.Optional;

public class ex04 {
    public static void main(String[] args) {

        Optional<String> os1 = Optional.of("Toy1");
        System.out.println(os1);
        System.out.println(os1.get());

        Optional<String> os2 = Optional.ofNullable("Toy2");
        System.out.println(os2);
        System.out.println(os2.get());

        Optional<String> os3 = Optional.ofNullable("Toy3");
        System.out.println(os3);
        System.out.println(os3.get());


        os3.ifPresent(System.out::println);

        // Optional은 if else를 간단하게 바꿀수 있는 형태를 지원해준다.
    }
}
