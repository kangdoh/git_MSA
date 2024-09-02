package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ex03 {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("myfile");

        while(true){
            int ch = fr.read();
            System.out.println(ch);
            System.out.println((char)ch);

            if(ch==-1){
                break;
            }
        }

//        int ch = fr.read();
//        System.out.println(ch);
//        System.out.println((char)ch);

    }



}
