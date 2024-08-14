package org.example;

public class ex001 {

    public static void main(String[] args) {


        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();

        Box<String> box3 = new Box();

        box1.setObj(new Apple());
        box2.setObj(new Orange());

        Apple apple = box1.getObj();
        Orange orange = box2.getObj();


        box3.setObj("dfadsf");


    }
}
