package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBRepository {

//    1. Class.forname jar 파일 추가 확인
//    2. Connnection DB연결
//    3. PreparedStatement sql 구문 작성
//    4. sql 구문실행
//    executeUpdate(); -> insert,delete, update
//    executeQuery(); -> select(반환 필요)

    public void insert(){
        Connection conn = null;
        PreparedStatement pstmt =null;
        try{
            // DB 실행
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/path",
                    "root",
                    "1234");
            // sql 생성
            pstmt = conn.prepareStatement("insert into aa(name,age) VALUES (?, ?)");
            String name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1, name);
            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            pstmt.setInt(2,age);
            // sql 구문 실행
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(conn!=null)
                    conn.close();
                if(pstmt!=null)
                    pstmt.close();
            }catch(Exception e){}
        }
    }

    public void delete(){
        Connection conn = null;
        PreparedStatement pstmt =null;
        try{
            // DB 실행
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/path",
                    "root",
                    "1234");

            // sql 생성
            pstmt = conn.prepareStatement("delete from aa where idx=?");
            int idx = Integer.parseInt(JOptionPane.showInputDialog("idx"));
            pstmt.setInt(1,idx);

            // sql 구문 실행
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(conn!=null)
                    conn.close();
                if(pstmt!=null)
                    pstmt.close();
            }catch(Exception e){}
        }
    }

    public void update(){
        Connection conn = null;
        PreparedStatement pstmt =null;
        try{
            // DB 실행
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/path",
                    "root",
                    "1234");
            // sql 생성
            pstmt = conn.prepareStatement("update aa set name=?, age=? where idx=?");

            String name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1, name);
            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            pstmt.setInt(2,age);
            int idx = Integer.parseInt(JOptionPane.showInputDialog("idx"));
            pstmt.setInt(3, idx);

            // sql 구문 실행
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(conn!=null)
                    conn.close();
                if(pstmt!=null)
                    pstmt.close();
            }catch(Exception e){}
        }
    }

    public void select(){
        Connection conn = null;
        PreparedStatement pstmt =null;

        // 반환되는 테이블 받기
        ResultSet rs = null;

        try{
            // DB 실행
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/path",
                    "root",
                    "1234");
            // sql 생성
            pstmt = conn.prepareStatement("select * from aa");

            // sql 구문 실행
            rs = pstmt.executeQuery();
            while(rs.next()){
//                System.out.print("idx = "+rs.getInt("idx"));
//                System.out.print("name = "+rs.getString("name"));
//                System.out.println("age = "+rs.getInt("age"));
                System.out.println("""
                        idx = %d;
                        name = %s;
                        age = %d
                        """.formatted(rs.getInt("idx"),
                        rs.getString("name"),
                        rs.getInt("age") ));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(conn!=null)
                    conn.close();
                if(pstmt!=null)
                    pstmt.close();
            }catch(Exception e){}
        }
    }




}