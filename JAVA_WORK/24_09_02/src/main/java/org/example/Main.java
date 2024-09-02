package org.example;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) throws IOException {

        try{
            OutputStream os = new FileOutputStream("data.dat");
            os.write(3);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println();
        }

        try{
            InputStream is = new FileInputStream("data.dat");
            int dat = is.read();
            System.out.println(dat);
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}