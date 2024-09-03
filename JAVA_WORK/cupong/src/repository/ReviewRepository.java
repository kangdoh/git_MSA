package repository;

import domain.Member;
import domain.Review;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReviewRepository {
    Scanner scan = new Scanner(System.in);

    // 리뷰보기
    public void select(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Review> list = new ArrayList<>();

        try{
            conn = DriverManager.getConnection("주소 등등");
            pstmt = conn.prepareStatement("selec * from Review");
            rs = pstmt.executeQuery();

            //집합의 첫 번째 행으로 이동하고, 그 행이 존재하면 true를 반환
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
        finally {

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
            conn = DriverManager.getConnection("주소 등등");
            pstmt = conn.prepareStatement(
                    "insert into Review(stars,contents,date) values(?, ?, ?)");
//            Class.forName("")
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
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection("주소 등등");
            pstmt = conn.prepareStatement("update Review set stars=?, contents=?, date=? where review_id=?");
            LocalDateTime localDateTime = LocalDateTime.now();

            pstmt.setInt(4, rid);
            pstmt.setInt(1, stars);
            pstmt.setString(2, contents);
            pstmt.setObject(3, localDateTime);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }

    // 리뷰삭제
    public void delete(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection("주소입력 등등");
            pstmt = conn.prepareStatement("delet from Review where review_id=?");
            pstmt.setInt(1, idx);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }



}