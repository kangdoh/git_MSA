package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class ex04 {
    public static void main(String[] args) {
        Stream<String> ss1 = Stream.of("adfa_s_df","gsg_sw_dga_sdg");

        ss1.flatMap(s-> Arrays.stream(s.split("_")))
                .forEach(System.out::println);

        System.out.println();

        ss1 = Stream.of("adfa_s_df","gsg_sw_dga_sdg");
        ss1.map(s->s.length())
                .forEach(System.out::println);

        System.out.println( );

        ss1 = Stream.of("adfa_s_df","gsg_sw_dga_sdg");
            ss1.flatMap(s->Stream.of(s.split("_")))
                    .forEach(System.out::println);

    }


}