package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;




public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,5,4,5);
        list = new ArrayList<>(list);
        System.out.println(list);

        list.stream().forEach(s -> System.out.println(s));

        Consumer<List<Integer>> consumer = mylist -> Collections.reverse(mylist);
        consumer.accept(list);
        System.out.println(list);
    }
}