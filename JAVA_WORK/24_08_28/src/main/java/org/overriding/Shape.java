package org.overriding;

public class Shape {
    protected String name;

    // 매개변수 생성자를 지정하면 기본생성자는 사라진다
    public Shape(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println(name);
    }

}
