package org.example;
import java.util.stream.Stream;

public class ex06 {
    public static void main(String[] args) {

        Stream.of(1,2,3,4,5,6,7)
                .peek(System.out::println)
                .sorted(((o1, o2) -> o2-o1))
                .forEach(System.out::println);

        int count = (int) Stream.of(10,20,5,8,9).count();
        System.out.println("count ="+count);

        int max = Stream.of(10,20,5,8,8,1,0,52)
                .mapToInt(value -> Integer.valueOf(value))
                .max()
                .orElse(0);

        System.out.println("max ="+max);
    }
}
