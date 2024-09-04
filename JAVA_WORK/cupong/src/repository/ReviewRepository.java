package repository;

import connection.DBConnectionUtil;
import domain.Member;
import domain.Review;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 이 부분이 connection을 import하는 부분
import static connection.DBConnectionUtil.getConnection;

public class ReviewRepository {

    // 리뷰보기
    public void select(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Review> list = new ArrayList<>();

        try{
            conn = getConnection(); //커넥션 반환
            pstmt = conn.prepareStatement("select * from Review");
            rs = pstmt.executeQuery();

            while(rs.next()){
                Review review = new Review(
                        rs.getInt("review_id"),
                        rs.getInt("member_id"),
                        rs.getInt("item_id"),
                        rs.getInt("stars"),
                        rs.getString("contents"),
                        rs.getString("date")
                );
                list.add(review);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 리뷰작성
    public void insert(Review review){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // 리뷰아이디(순번)나 회원아이디 제품 아이디는 자동으로???
        try{
            LocalDateTime localDate = LocalDateTime.now();
            conn = getConnection();
            pstmt = conn.prepareStatement(
                    "insert into Review(stars,contents,date) values(?, ?, ?)");
            pstmt.setInt(1, review.getStars());
            pstmt.setString(2, review.getContents());
            pstmt.setObject(3, localDate);
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }

    // 리뷰수정
    public void update(Review review){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            LocalDateTime localDateTime = LocalDateTime.now();
            conn = getConnection();
            pstmt = conn.prepareStatement("update Review set stars=?, contents=?, date=? where review_id=?");

            pstmt.setInt(4, review.getReview_id());
            pstmt.setInt(1, review.getStars());
            pstmt.setString(2, review.getContents());
            pstmt.setObject(3, localDateTime);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // 리뷰삭제
    public void delete(Review review){
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            conn = getConnection();
            pstmt = conn.prepareStatement("delet from Review where review_id=?");
            pstmt.setInt(1, review.getReview_id());

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}