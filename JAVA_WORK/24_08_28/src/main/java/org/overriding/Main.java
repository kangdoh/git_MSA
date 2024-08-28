package org.overriding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 부모 클래스 참조변수는 자식 클래스 변수들을 포함할 수 있다

        Shape s;

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 모양을 입력해라");
        n = scanner.nextInt();

        switch (n) {
            case 1:
                s = new Triangle();
                s.draw();
                break;
            case 2:
                s = new Rectangle();
                s.draw();
                break;
            default:
                break;
        }
    }
}
