package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ex04 {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myfile", true));

        bw.write("글자를 바꿀거야");
        bw.newLine();
        bw.write("바꼇나");
        bw.newLine();
        bw.close();

        BufferedReader fr = new BufferedReader(new FileReader("myfile"));

        while(true){
            String str = fr.readLine();
            System.out.println(str);

            if(str==null){
                break;
            }
        }

    }
}
