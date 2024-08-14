package org.example;

public class Box <T>{
    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    private T t;

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}
