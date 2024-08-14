package org.example;

public class SteelBox<T> extends Box<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public SteelBox(T t, T t1) {
        super(t);
        this.t = t1;
    }

}