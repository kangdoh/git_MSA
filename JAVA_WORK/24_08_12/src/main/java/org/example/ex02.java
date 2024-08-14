package org.example;

import java.util.Random;
import java.util.StringTokenizer;

public class ex02 {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i =0; i<10; i++){
            System.out.println(random.nextInt(1000));
        }

        StringTokenizer st1 = new StringTokenizer("pm:08:45", ":");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }


    }
}
