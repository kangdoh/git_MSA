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

    ReviewRepository reviewRepository = new ReviewRepository();
    //어떤 서비스를 호출할지 선택 후 해당 서비스 호출
    public void handleMemberService() {


    }
}
