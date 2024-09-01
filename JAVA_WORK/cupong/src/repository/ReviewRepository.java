package repository;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ReviewRepository {
    Scanner scan = new Scanner(System.in);

    // 리뷰보기
    public void select(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection("주소 등등");
            pstmt = conn.prepareStatement("selec * from Review");
            rs = pstmt.executeQuery();

            //집합의 첫 번째 행으로 이동하고, 그 행이 존재하면 true를 반환
            while(rs.next()){
                System.out.print("리뷰ID = "+rs.getInt("review_id"));
                System.out.print("회원ID = "+rs.getInt("memder_id"));
                System.out.println("상품ID = "+rs.getInt("item_id"));
                System.out.println("별점 = "+rs.getInt("stars"));
                System.out.println("내용 = "+rs.getString("contents"));
                System.out.println("작성일 = "+rs.getString("date"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }

    // 리뷰작성
    public void insert(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // 리뷰아이디(순번)나 회원아이디 제품 아이디는 자동으로???
        try{
            conn = DriverManager.getConnection("주소 등등");
            pstmt = conn.prepareStatement(
                    "insert into Review(stars,contents,date) values(?, ?, ?)");

            System.out.println("평점을 입력해주세요.");
            int stars = scan.nextInt();
            pstmt.setInt(1, stars);

            System.out.println("내용을 입력해주세요.");
            String contents = scan.next();
            pstmt.setString(2, contents);

            LocalDate localDate = LocalDate.now();
            // LocalDate를 sql문으로 바꿔서 사용을 해야한다.
            Date sqlDate = Date.valueOf(localDate);
            pstmt.setDate(3, sqlDate);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }


    // 리뷰수정
    public void update(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection("주소 등등");
            pstmt = conn.prepareStatement("update Review set stars=?, contents=?, date=? where review_id=?");

            System.out.println("수정할 리뷰 아이디를 입력해주세요.");
            int rid = scan.nextInt();
            pstmt.setInt(4, rid);

            System.out.println("수정할 별점을 입력해 주세요.");
            int stars = scan.nextInt();
            pstmt.setInt(1, stars);

            System.out.println("수정할 리뷰 내용을 입력해주세요.");
            String contents = scan.next();
            pstmt.setString(2, contents);

            LocalDate localDate = LocalDate.now();
            // LocalDate를 sql문으로 바꿔서 사용을 해야한다.
            Date sqlDate = Date.valueOf(localDate);
            pstmt.setDate(3, sqlDate);

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

            System.out.println("삭제할 리뷰의 아이디를 입력해 주세요.");
            int idx = scan.nextInt();
            pstmt.setInt(1, idx);

            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }



}