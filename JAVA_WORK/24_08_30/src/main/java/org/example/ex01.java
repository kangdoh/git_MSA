package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ex01 {
    public static void main(String[] args) {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;

        List<Member> list = new ArrayList<>();

        try(Connection conn =
                    DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/path","root","1234")){
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 인텔리 제이 단축키 대문자 변환 ctrl + shift + u
            PreparedStatement pstmt = conn.prepareStatement("select * from aa order by idx desc");
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
//                Member member = Member.builder()
//                        .name(rs.getString("name"))
//                        .idx(rs.getInt("idx"))
//                        .age(rs.getInt("age"))
//                        .regdate(rs.getObject("regdate", LocalDateTime.class))
//                        .mydate(rs.getObject("mydate", LocalDateTime.class))
//                        .build();
                Member member = new Member(
                        rs.getInt("idx"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("password"),
                        rs.getObject("regdate",LocalDateTime.class),
                        rs.getObject("mydate",LocalDateTime.class)
                );

                list.add(member);
            }
            list.stream().forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }


}