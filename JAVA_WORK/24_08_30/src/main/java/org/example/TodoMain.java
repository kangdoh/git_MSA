package org.example;

import org.example.Member.Member;
import org.example.Member.MemberRepository;

import java.util.Scanner;

public class TodoMain {
    Scanner scanner = new Scanner(System.in);

    private MemberRepository memberRepository = new MemberRepository();

    public static Member MEMBER;

    TodoMain(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("""
                뭐할래?>
                0. 로그인
                1. member select
                2. member insert
                3. member update
                4. member delete
                5. todo select
                6. todo insert
                7. todo update
                8. todo delete
                """);

            int ra = scan.nextInt();
            if (ra==0){
                System.out.println("어떤 사용자 할래?>??");
                int member_idx = scanner.nextInt();
                Member member = memberRepository.findByIdx(member_idx);

                if (member == null){
                    System.out.println("로그인 실패");
                }
                else {
                    System.out.println("로그인 성공");
                    System.out.println(member);
                }
                //  System.out.println(ex01.MEMBER);
            }
            else if(ra==1){
                memberRepository.select();
            }
            else if(ra==2){
                memberRepository.insert();
            }
            else if(ra==4){
                System.out.println("삭제할아이디를 입력하세요.");
                memberRepository.delete();
            }
            else if(ra==6){

            }
            else{
                System.out.println("종료됩니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        new TodoMain();
    }

}