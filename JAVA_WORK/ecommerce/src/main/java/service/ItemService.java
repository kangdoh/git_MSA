package service;

import domain.Order;
import domain.Review;
import common.Session;
import repository.*;

import java.sql.SQLException;
import java.util.Scanner;

//(상품 등록, 상품 삭제, 상품 수정, 전체 상품 조회) + 카테고리별 조회 + 리뷰 + 장바구니
public class ItemService {

    private final ItemRepository itemRepository;
    private final CategoryRepository categoryRepository;
    private final CategoryItemRepository categoryItemRepository;
    private final ReviewRepository reviewRepository;
    private final OrderItemRepository orderItemRepository;

    public ItemService(ItemRepository itemRepository, CategoryRepository categoryRepository, CategoryItemRepository categoryItemRepository, ReviewRepository reviewRepository, OrderItemRepository orderItemRepository) {
        this.itemRepository = itemRepository;
        this.categoryRepository = categoryRepository;
        this.categoryItemRepository = categoryItemRepository;
        this.reviewRepository = reviewRepository;
        this.orderItemRepository = orderItemRepository;
    }

    public void handleItemService(Scanner sc){

        int choice = sc.nextInt();
        ViewItemService();

        switch (choice){
            case 1:
                ViewReviewService();
                switch (choice){
                    case 1: //리뷰보기
                        selectReview();
                        break;

                    case 2: //리뷰작성
                        insertReview(sc);
                        break;

                    case 3: //리뷰수정
                        updateReview(sc);
                        break;

                    case 4: //리뷰삭제
                        deleteReview(sc);
                        break;

                    default:
                        ServiceBreak();
                }
            default:
                ServiceBreak();
        }
    }

    private void insertReview(Scanner scan) throws SQLException {
        System.out.println("리뷰를 남기실 상품 ID를 입력해주세요.");
        Long itemId = scan.nextLong();
        // 이것은 리뷰테이블과는 관계가 없는 회원의 아이디
        Long memberId = Session.getInstance().getCurrentMember().getMemberId();

        // orders, order_item 조인 where item_id = ? AND member_id = ?
        // 검증

        Boolean byItemIdAndMemberId = orderItemRepository.findByItemIdAndMemberId(itemId, memberId);
        if (byItemIdAndMemberId){
            //성공 시
            System.out.println("평점을 입력해주세요.");
            int stars = scan.nextInt();
            System.out.println("내용을 입력해주세요.");
            String contents = scan.next();

            Review review = Review.of(stars, contents,memberId,itemId);
            reviewRepository.insert(review);
        }else {
            //실패 시
            System.out.println("해당상품에 대한 리뷰를 작성하실 수 없습니다.");
        }
    }

    private void updateReview(Scanner sc) {
        System.out.println("수정할 리뷰 아이디를 입력해주세요.");
        Long reviewId = sc.nextLong();
        // 권한 확인
        Long memberId = Session.getInstance().getCurrentMember().getMemberId();

        Review review = reviewRepository.findById(reviewId);
        if (review.getMemberId() == memberId)



        System.out.println("수정할 별점을 입력해 주세요.");
        int stars = sc.nextInt();
        System.out.println("수정할 리뷰 내용을 입력해주세요.");
        String contents = sc.next();

        Review review = Review.of(reviewId, stars, contents);
        reviewRepository.update(review);
        return;
    }

    private void selectReview() {
        // 권한 확인
        Long memberId = Session.getInstance().getCurrentMember().getMemberId();
        reviewRepository.select();
    }

    private void deleteReview(Scanner scan) {
        System.out.println("삭제할 리뷰의 아이디를 입력해 주세요.");
        Long reviewId = scan.nextLong();
        // 권한 확인
        Long memberId = Session.getInstance().getCurrentMember().getMemberId();

        reviewRepository.delete(reviewId);
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
    }

}
