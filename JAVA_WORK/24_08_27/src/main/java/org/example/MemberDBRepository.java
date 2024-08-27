package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDBRepository {

    public List<Member> select(){
        List<Member> list = new ArrayList<>();

        Connection conn = null; // DB연결 객체
        PreparedStatement pstmt = null; // sql작성 객체
        ResultSet rs = null;  //selcet 문 테이블 담는 객체

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3307/path", "root", "1234"
            );
            pstmt = conn.prepareStatement("select * from aa");
            rs = pstmt.executeQuery();

            while(rs.next()){
                Member member = new Member(
                        rs.getInt("idx"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                list.add(member);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }

        return list;

    }
}
