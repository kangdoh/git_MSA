package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ex06 {
    public static void main(String[] args) {

        MemberDBRepository memberDBRepository = new MemberDBRepository();

        List<Member> list = memberDBRepository.select();

//        list.stream().forEach(s-> System.out.println(s));
        list.stream().forEach(System.out::println);
    }
}