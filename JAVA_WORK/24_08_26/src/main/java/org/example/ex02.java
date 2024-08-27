package org.example;
import java.util.Random;


@FunctionalInterface
interface RAN{
    int ran();

    default int ran2() {
        return 0;
    }
}


public class ex02 {
    public static void main(String[] args) {
        RAN ran = ()-> new Random().nextInt(50);
        for (int i =0; i<10; i++)
        System.out.println(ran.ran());
    }
}



