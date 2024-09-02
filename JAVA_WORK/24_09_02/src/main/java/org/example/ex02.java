package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ex02 {
    public static void main(String[] args) {

        //file 내용 쓰기
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("mydata"))){
            dos.writeInt(4);
            dos.writeDouble(17.4);
            dos.writeInt(5);
        }
        catch (Exception e){
            e.printStackTrace();
        }


        //file 내용 읽기
        // int double int
        try(DataInputStream dis = new DataInputStream(new FileInputStream("mydata"))){
            int temp = dis.readInt();
            double temp2 = dis.readDouble();
            int temp3 = dis.readInt();

            System.out.println(temp);
            System.out.println(temp2);
            System.out.println(temp3);
        }
        catch (Exception e){
            e.printStackTrace();
        }
























































































    }
}
