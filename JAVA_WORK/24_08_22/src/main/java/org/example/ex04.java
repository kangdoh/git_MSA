package org.example;

public class ex04 {
    public static void main(String[] args) {
        who(Person.MAN);
//        who(Animal.DOG);
    }

    public static void who(Person person){
        if(person==Person.MAN){
            System.out.println("남성 손님입니다.");
        }else{
            System.out.println("여성 손님입니다.");
        }
    }




}
