package org.example;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ex05 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        // 형태를 정해주는부분 (yyyy MM 같은 것들은 지정되어있는 변수이다.)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");

        System.out.println(dtf.format(now));
    }

}
