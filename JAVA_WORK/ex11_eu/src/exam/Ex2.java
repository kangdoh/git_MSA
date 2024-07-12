package exam;

import java.util.Scanner;

class A {
    public void a1(int nn) {
        if (nn % 2 != 0) {
            System.out.println(nn);
        }
    }
}

class C {
    public void c(int nn) {
        if (nn % 2 == 0) {
            System.out.println(nn);
        }
    }
}


public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 10개를 입력하시오.");
        int a[] = new int[10];
        A call1 = new A();
        C call2 = new C();

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("홀수 정수는 = ");
        for (int j = 0; j < 10; j++) {
            call1.a1(a[j]);
        }
        System.out.println("짝수 정수는 = ");
        for (int k = 0; k < 10; k++) {
            call2.c(a[k]);
        }
    }
}
