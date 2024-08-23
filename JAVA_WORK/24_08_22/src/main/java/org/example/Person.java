package org.example;

//public interface Person {
//    int MAN = 1;
//    int WOMAN = 2;
//
//}

enum Person{
    MAN(1),WOMAN(2);

    private int num;

    Person(int num){
        this.num = num;
    }



}