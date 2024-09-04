import service.ItemService;
import service.MemberService;
import service.OrderService;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MemberService memberService = new MemberService();
        ItemService itemService = new ItemService();
        OrderService orderService = new OrderService();

        ViewService();

        int a = scan.nextInt();
        switch (a){
            case 1:
                itemService.handleItemService();
            case 2:
                memberService.handleMemberService();
            case 3 :
                orderService.handleOrderService();
            default:
                break;
        }
    }


    private static void ViewService() {
        System.out.println("""
                1. 상품서비스
                2. 회원서비스
                3. 주문서비스
                """);
    }
}