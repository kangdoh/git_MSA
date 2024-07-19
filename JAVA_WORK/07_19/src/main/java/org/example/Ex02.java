package org.example;

import org.example.test.AA;
import org.example.test.BB;
import org.example.test.CC;

public class Ex02 {
    // 부모클래스에 자식클래스를 담을 수 있다.(extends한 파일)
    // 자식클래스 생성했을때 부모클래스로 참조 할 수 있다.
    // 클래스 다양성
    public static void main(String[] args) {
        AA a1 = new BB();
        AA a2 = new CC();

        a1.bb();
        a2.cc();
    }
}