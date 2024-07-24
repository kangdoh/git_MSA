package org.example;

public class Ex04 {

    public static void main(String[] args) {

        try{
            throw new MyException(
                    new ErrorCode("id를 입력하세요.", "ㅁㅇㄹ", "ㅇㄹㅇ")
            );
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }


    }
}
