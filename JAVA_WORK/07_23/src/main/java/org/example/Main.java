package org.example;
import org.example.inter.Printable;
import org.example.print.LgPrinter;
import org.example.print.SamPrinter;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(Printable.HEIGHT);
        System.out.println(Printable.WIDTH);

//      final이 붙어있어서 값의 변경이 불가능하다.
//      Printable.HEIGHT = 90;

        Printable prn = new LgPrinter();
        prn.print("내문서");

        prn = new SamPrinter();
        prn.print("내문서");

    }
}