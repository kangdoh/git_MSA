package service;

import domain.Review;
import domain.Session;
import repository.ReviewRepository;

import java.util.Scanner;

//(상품 등록, 상품 삭제, 상품 수정, 전체 상품 조회) + 카테고리별 조회 + 리뷰 + 장바구니
public class ItemService {

    ReviewRepository reviewRepository = new ReviewRepository();

    public void handleItemService(){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        ViewItemService();

        switch (S){
            case 1:
                ViewReviewService();
                switch (S){
                    case 1:
                        reviewRepository.select();

                    case 2:
                        System.out.println("리뷰를 남기실 상품 ID를 입력해주세요.");
                        Long itemId = scan.nextLong();
                        //해당 상품을 구매한 이력이 있는지 체크

                        //성공 시
                        System.out.println("평점을 입력해주세요.");
                        int stars = scan.nextInt();
                        System.out.println("내용을 입력해주세요.");
                        String contents = scan.next();
                        // 연구대상
                        Long memberId = Session.getInstance().getCurrentMember().getMemberId();

                        Review review = new Review(memberId, itemId, stars, contents);
                        reviewRepository.insert(review);

                    case 3:
                        System.out.println("수정할 리뷰 아이디를 입력해주세요.");
                        int rid = scan.nextInt();
                        System.out.println("수정할 별점을 입력해 주세요.");
                        int stars = scan.nextInt();
                        System.out.println("수정할 리뷰 내용을 입력해주세요.");
                        String contents = scan.next();

                        Review review = new Review(rid, stars, contents);
                        reviewRepository.update(review);

                    case 4:
                        System.out.println("삭제할 리뷰의 아이디를 입력해 주세요.");

                        review(rid);
                        reviewRepository.delete(review);

                    default:
                        ServiceBreak();
                }
            default:
                ServiceBreak();
        }
    }






    private static void ViewItemService() {
        System.out.println("""
                1. 리뷰서비스
                2. ~~~~
                3. ~~~~
                """);
    }
    private static void ViewReviewService() {
        System.out.println("""
                1. 리뷰보기
                2. 리뷰작성
                3. 리뷰수정
                4. 리뷰삭제
                """);
    }
    private static void ServiceBreak() {
        System.out.println("잘못된 번호 입니다.");
        return;
    }

}