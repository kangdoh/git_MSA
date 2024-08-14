package org.example;

public class ex01 {
    public static void main(String[] args) {

        BoxFactory.peekBox4(new Box<>(new AA()));
        BoxFactory.peekBox4(new Box<>(new BB()));
        BoxFactory.peekBox4(new Box<>(new CC()));

//        BoxFactory.peekBox4(new Box<>(new Object()));

    }
}