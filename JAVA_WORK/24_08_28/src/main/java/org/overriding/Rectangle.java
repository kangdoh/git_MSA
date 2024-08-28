package org.overriding;

public class Rectangle extends Shape {

    public Rectangle(String name) {
        super(name);
    }



    @Override
    public void draw() {
        System.out.println(name);
    }
}