package 연습;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하시오.");
        Scanner scanner = new Scanner(System.in);

        Ex3 num1 = new Ex3();
        int a = scanner.nextInt();
        int b = num1.ex2(a);


        int j = 1;
        for (j = 1; j < 10; j++) {
                System.out.println(a + "*" + j + "=" + b);


        }

    }

}
