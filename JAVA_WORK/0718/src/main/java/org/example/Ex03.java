package org.example;
import org.example.aa.Bizman;

public class Ex03 {
    public static void main(String[] args) {
        Bizman aaa = new Bizman("홍길동", "그린컴퓨터", "선생님");
        Bizman bbb = new Bizman("고길동", "그린컴퓨터", "선생님");
        
        aaa.showInfo();

//  인스턴스는 참조변수가 있어야 한다.
//  (참조변수가 없으면 컴퓨터에서 사용하지 않는 필요업는 데이터라 생각하여 데이터를 없애버린다.)

        new Bizman("홍길동", "그린컴퓨터", "선생님");
        Bizman.showInfo();

//  다른 방법으로는 static을 활용하여 저장하면 static 공간에 메모리가 저장되어 사용할 수 있는데.
//  그렇게 하면 상용하는 메소드나 변수 또한 static으로 지정해 줘야하기 때문에
//  메모리적으로 좋지 않으니 참조변수를 활용하는편이 가장 좋을것 같다.


    }
}