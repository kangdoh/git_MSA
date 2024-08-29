package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ex08 {
    public static void main(String[] args) {

        List<Integer> oddlist = Stream.of(1,2,3,47,5,8,8,45)
                .filter(integer -> integer%2==1)
                .collect(
                        ()-> new ArrayList<Integer>()
                        ,  (list,item) -> list.add(item)
                        , ((integers, integers2) -> integers.addAll((integers2)))
                );
//                .forEach(System.out::println);

    }
}
