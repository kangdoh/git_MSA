package org.example;

interface Printable{
    void print();
};

class Print1 implements Printable{
    @Override
    public void print() {
        System.out.println("상속받는 방법");
    }
}
public class Printer {
    public static void main(String[] args) {
//        Printable printable = new Printable() {
//            @Override
//            public void print() {
//                System.out.println("익명 인터페이스");
//            }
//        };
        Printable printable = ()->{
            System.out.println("람다");
        };
    }
}