package org.example;


interface AA{
    void doA();
}
public class ex04 {
    public static void main(String[] args) {
        AA aa = ()->{
            System.out.println("doA출력");
        };



        aa.doA();
    }
}