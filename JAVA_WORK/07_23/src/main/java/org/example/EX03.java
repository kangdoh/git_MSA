package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX03 {


//  interface는 몸체가 없는 메서드(public 없는)를 정의가능 - void doA() 같은
//  변수도 static, final, public 생략되어있어 안적어도 된다.
//  class를 만들어서 interface 상속을 받아야 함..
//  그 후에는 doA() 메서드를 재정의 해야한다.

//  default(), static() 추가 가능하다.
//  메서드 안에 존재가능

//  static()




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
//            int a = 10;
//            int b = 0;
            System.out.println("나누기 시작");
            System.out.println(a / b);
            System.out.println("나누기 끝");
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("0 으로 나눌수 없습니다.");
        }
        catch(InputMismatchException i){
            System.out.println("문자를 넣으면 안되요.");
        }
        catch(Exception p){
            System.out.println("이것은 모든 예외 상황");
        }
        System.out.println("정상 종료 되었습니다.");

    }
}
