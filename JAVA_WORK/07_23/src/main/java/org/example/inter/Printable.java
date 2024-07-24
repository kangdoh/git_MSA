package org.example.inter;
// interface 에서 사용하면!
public interface Printable {

//  public static final int HEIGHT = 70;
//  생략되어진 것이다.
    int HEIGHT = 70;
    int WIDTH = 120;

    void print(String mydoc);

//  interface를 상속 받게 되면 재정의 해야한다.

    default void clean(){
        System.out.println("청소기능 추가");
    }

    static void printLine(){
        System.out.println("asdfasdfasdfs");
    }

}