package service;

import domain.Cart;
import domain.Orders;
import domain.Review;

import java.util.Scanner;

public class MemberService {

    public void memberservice(){
        System.out.println();
        Scanner scan = new Scanner(System.in);


        System.out.println("""
                1. 장바구니 보기
                2. 주문하기
                3. 리뷰기능
                """);

        int a = scan.nextInt();

        switch (a){
            case 1:
                Cart cart = new Cart();
                cart.select();
            case 2:
                Orders orders = new Orders();
                orders.order();
            case 3:
                Review review = new Review();
                review.select();
            default:
        }
    }

}
