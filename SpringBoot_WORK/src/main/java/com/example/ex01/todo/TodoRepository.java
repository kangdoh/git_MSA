package com.example.ex01.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class TodoRepository {

    public void select(){}

//    public void insert(){
//        if(MEMBER == null)
//        {
////            System.out.println("\\u001B[31m");
//            System.out.println("로그인하셔야 합니다.");
//            return;
//        }
//        try( Connection conn
//                     = DriverManager.getConnection(
//                "jdbc:mysql://192.168.0.29:3307/pmh","root","1234") ){
//            PreparedStatement pstmt = conn.prepareStatement("""
//                        INSERT INTO todo
//                        (dodate,content,member_idx)
//                        values
//                        (?,?,?)
//                    """);
//            pstmt.setObject(1, LocalDate.of(2024,9,10));
//            pstmt.setString(2,"영어공부");
//            pstmt.setInt(3, TodoMain.MEMBER.getIdx());
//            pstmt.executeUpdate();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }


}
