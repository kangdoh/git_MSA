package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex01 {

    private  MemberRepository memberRepository = new MemberRepository();


    ex01(){
        System.out.println("""
                뭐할래?>
                1. select
                2. insert
                3. update
                4. delete
                """);

        while(true){
            Scanner scan = new Scanner(System.in);
            int ra = scan.nextInt();

            if(ra==1){
                memberRepository.select();
            }
            if(ra==2){
                memberRepository.insert();
            }
            else{
                System.out.println("종료됩니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        new ex01();
    }

}