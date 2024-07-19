package org.example.Phone;

public class SmartPhone extends MobilePhone{

    private String androidver;

// 부모클래서의 생서자를 호출하는 것
    public SmartPhone(String aver, int number) {
        super(number);
        this.androidver = aver;
    }

    public void show(){
        System.out.println("androidver = "+ androidver);
        System.out.println("number = "+ number);
    }

}
