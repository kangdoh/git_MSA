/*
가위 바위 보 게임을 만들어 보자.
사용자로부터 가위 바위 보 중에서 하나를 입력 받는다.
그리고 컴퓨터는 난수 생성을 통해서 가위 바위 보 중에서 하나를 선택하게 한다.
이 둘을 비교해서 승자와 패자를 가려주는 프로그램을 작성해 보자.
단 프로그램의 진행은 사용자가 질 때까지 계속되어야 하고,
마지막에 가서는 게임의 결과(예: 4승 3무)까지 출력해 주도록 하자.
 */

import java.util.Scanner;

public class 문제풀이 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//입력

        for (  ;true;  ) {
            String q = scan.nextLine();
            System.out.println(q);

            double a = Math.random() * 3;
            int b = (int) a;
            System.out.println(b);
            // 0가위 1바위 2보

            if (q.equals("가위") && b == 1) {
                System.out.println("패");
                break;

            } else if (q.equals("가위") && b == 0) {
                System.out.println("무");


            } else if (q.equals("가위") && b == 2) {
                System.out.println("승");


            } else if (q.equals("바위") && b == 0) {
                System.out.println("패");
                break;

            } else if (q.equals("바위") && b == 1) {
                System.out.println("무");


            } else if (q.equals("바위") && b == 2) {
                System.out.println("승");


            } else if (q.equals("보") && b == 0) {
                System.out.println("패");
                break;

            } else if (q.equals("보") && b == 1) {
                System.out.println("승");


            } else if (q.equals("보") && b == 2) {
                System.out.println("무");


            }
        }











//        for (int a = 0; a < 10; a++)
//
//
//
//            if ()
//

    }
}
