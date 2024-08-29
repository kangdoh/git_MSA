package org.overriding;

public class Triangle extends Shape {

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println(name);
    }
}

