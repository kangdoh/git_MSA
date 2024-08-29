package org.example;

import java.util.stream.Stream;

public class ex07 {
    public static void main(String[] args) {

        boolean b=Stream.of(1,2,3,4,5,6)
                .noneMatch(integer -> integer%2==0);
        System.out.println("b ="+b);
    }
}
