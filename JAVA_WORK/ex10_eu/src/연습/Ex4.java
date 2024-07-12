package 연습;

// 0 1 1 2 3 5 8 13 21
// a b c d e f ...
//     a+b

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner1.nextInt();
        int c = 0;


        for(int i=0; i<10; i++){
            b = b+b-a;
            System.out.println(b);
        }


    }
}
