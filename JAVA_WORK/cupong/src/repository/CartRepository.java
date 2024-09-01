package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CartRepository {

    // (조회)
    // 장바구니 보기
    public void select(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection("주소");
            pstmt = conn.prepareStatement("select *from Cart");
            rs = pstmt.executeQuery();

            while(rs.next()){
//                System.out.print("상품ID = "+rs.getInt("cart_item_id"));
                System.out.print("장바구니ID = "+rs.getInt("cart_id"));
                System.out.println("상품ID = "+rs.getInt("item_id"));
                System.out.println("총금액 = "+rs.getInt("total_price"));
                System.out.println("갯수 = "+rs.getString("count"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }


    // (입력)
    // 장바구니 물건담기
    public void insert(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            conn = DriverManager.getConnection("주송");
            pstmt = conn.prepareStatement("insert into Cart() value()");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }


    // (수정)
    // 물건 수량 변경
    public void update(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }


    // (삭제)
    // 장바구니 물건빼기
    public void delete(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

        }
    }




}