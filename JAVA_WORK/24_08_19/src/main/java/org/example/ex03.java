package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex03 {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("toy", "box", "robot");

        list = new ArrayList<>(list);

        list.add("이거 안됨?>");
        System.out.println(list);
    }


}