package org.example.aa;

// 기본 생성자는 다른 생성자를 선언하게 되면 생략 불가
// 상속관계에서는 부모클래스의 생성자는 무조건 적으로 호출 되어져야 한다.(무엇이든)
// 상속관계에서는 부모클래스의 기본 생성자를 호출하는게 있는데 ← 이게 생략되어져 있습니다.
// 만약에 부모클래스에 기본생성자가 언언되어져 있지 않을 때에는 , 다른생성자 호출을 통해 부모클래스 생성자 호출할 수 있다.

public class Bizman extends Man{

    private String company;
    private String position;

    public Bizman(){
        super();
    }
    public Bizman(String name, String company, String position){
        // super는 부모 클래스의 것을 가져온다.
        super(name);
        this.company = company;
        this.position = position;
    }


    public static void showInfo(){
        System.out.println("company = "+company);
        System.out.println("company = "+position);
        tellInfo();
    }


}




