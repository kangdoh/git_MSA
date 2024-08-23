package org.example;

//public interface Animal {
//    int DOG = 1;
//    int CAT = 2;
//
//}

enum Animal{
    DOG(1),CAT(2);

    private int num;

    Animal(int num) {
        this.num = num;
    }



}