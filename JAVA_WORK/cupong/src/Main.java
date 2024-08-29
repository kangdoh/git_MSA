import service.MemberService;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("""
                1. 상품보기
                2. 마이페이지
                3. 주문하기
                """);

        System.out.println();
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();



        switch (a){
            case 1:
                System.out.println("1");
            case 2:
                MemberService aaa = new MemberService();
                aaa.memberservice();
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");
        }

    }
}







