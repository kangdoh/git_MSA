package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex04 {
    public static void main(String[] args) {
//        Stream<Integer> integerStream = Arrays.stream(arr);
//        Stream.of(1,2,4,3,5).filter(n->n%2==1)

        List<Member> list = Arrays.asList(
                new Member(1, "홍길동", 10, "email", "password"),
                new Member(2, "김길동", 30, "email", "password"),
                new Member(3, "최길동", 20, "email", "password"),
                new Member(4, "박길동", 50, "email", "password")
        );
        int result = 0;
        for (Member member:list){
            result += member.getAge();
            System.out.println(member);
        }
        System.out.println("나이에 최종합" + result);

        // 30이상인 사람 출력
        list.stream().filter(member->member.getAge()>=30)
                .forEach(s->{
                    System.out.println("내용");
                    System.out.println(s);
                });

        // map 은변경, filter는 걸러내는것







    }
}
