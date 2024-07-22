package org.example;


interface Printable{
    public void print();
    public void doA();
}

public class Print implements Printable{

    @Override
    public void print(){
        System.out.println("프린트 됨");
    }

    @Override
    public void doA(){
        System.out.println("프린트 불가");
    }

    public static void main(String[] args) {
        Printable print = new Print();
        print.print();
    }

}