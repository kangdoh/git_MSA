package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Person[] parr = {
//                new Person("홍길동", 20),
//                new Person("홍홍길길동", 30),
//                new Person("홍홍길길동동", 40),
//        };
//        Arrays.sort(parr);
//        System.out.println(Arrays.toString(parr));

        SmartPhone s14 = new SmartPhone("실버");

//        s14.color = "검은색"; <- 프로그램 버그 가능성이 아주 높다
        s14.setColor("검은색");


    }
}