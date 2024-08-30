package org.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Instant is1 = Instant.now();
        System.out.println(is1);

        List<String> list = Arrays.asList("11", "232", "2110", "d545", "554");
//        list.stream().forEach(System.out::println);
        for(String temp:list){
            System.out.println(temp);
        }


        //Instant은 시간을 구하는 공식이다.
        //세세한 시간까지 구해서 구하는 순서에따라 시간차가 날 정도이다.
        Instant is2 = Instant.now();
        System.out.println(is2);


        //Duration 은 시간의 차를 구하는 공식이다.
        Duration dt = Duration.between(is1,is2);
        System.out.println(dt);


        //LocalDate 날짜를 구하는 코드
        LocalDate today = LocalDate.now();
        System.out.println(today);

    }
}