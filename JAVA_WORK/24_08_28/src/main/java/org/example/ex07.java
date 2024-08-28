package org.example;

import java.util.Optional;

public class ex07 {
    public static void main(String[] args) {
        Optional<String> os1 = Optional.of("안녕하세요.");

        String str = os1.flatMap(s -> Optional.of("바뀌는걸 Optional로"))
                .orElse("empty");

        System.out.println(str);

    }
}
