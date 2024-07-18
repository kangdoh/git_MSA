package org.example;
import org.example.aa.Box;

public class ex01 {
    ex01(){
        Box box = new Box("내 상자");
        System.out.println(box);

        System.out.printf("%s\n", "문자열출력");
//        System.out.printf("%d", "");
//        System.out.printf("%f", "");
//        System.out.printf("%o\n", "진수변경");

        int a = 10;
        int b = 20;

        System.out.printf("%d\n", a);
        System.out.printf("%f\n", (double)a);
        System.out.printf("%o\n", a);
        System.out.printf("%x\n", a);

        System.out.println();

        System.out.println(String.format("%d + %d = %d", a, b, a+b));
    }

    public static void main(String[] args) {
        new ex01();
    }


}