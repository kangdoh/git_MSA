package service;

import domain.Cart;
import domain.CartItem;
import domain.Orders;
import domain.Review;
import repository.CartItemRepository;
import repository.CartRepository;
import repository.ReviewRepository;

import java.util.Scanner;

//회원 가입, 회원 수정, 회원 본인 조회, 회원 삭제(탈퇴), 로그인, 로그아웃
public class MemberService {
    public void memberservice(){
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                1. 리뷰관리하기
                2. 장바구니
                3. 장바구니 상품
                """);
        int a = scan.nextInt();

        switch (a){
            case 1:
                ReviewRepository reviewRepository = new ReviewRepository();
                System.out.println("""
                            1. 내 리뷰 보기
                            2. 리뷰 작성하기
                            """);
                switch (a){
                    // 내 리뷰보기
                    case 1:
                        reviewRepository.select();
                        System.out.println("""
                                1. 리뷰 수정하기
                                2. 리뷰 삭제하기
                                """);
                        switch (a){
                            // 리뷰수정
                            case 1:
                                reviewRepository.update();
                            // 리뷰삭제
                            case 2:
                                reviewRepository.delete();
                            default:
                                break;
                        }
                    // 리뷰작성
                    case 2:
                        reviewRepository.insert();
                    default:
                        break;
                }
            case 2:
                CartRepository cartRepository = new CartRepository();
                cartRepository.select();
                cartRepository.insert();
                cartRepository.update();
                cartRepository.delete();
            case 3:
                CartItemRepository cartItemRepository = new CartItemRepository();

            default:
                System.out.println("다시 선택해주세요.");
                break;
        }
    }

}
