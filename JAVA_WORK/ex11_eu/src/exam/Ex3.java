package exam;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 10개를 입력하시오.");
        int a[] = new int[10];
        int b[] = new int[10];


        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();

            if (a[i] % 2 != 0) {

            }
            } else {
                for (int k = a.length; k >= 0; k--) {
                    a[k] = num;
                }
            }
            System.out.println(a[i]);

        }



    }
}
