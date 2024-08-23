package org.example;

import java.awt.print.Paper;

interface Printable{
    void print();
}

class Papers{
    private String con;
    public Papers(String con){
        this.con = con;
    }
    public Printable getPrint(){
        return new Printer();
    }

    private class Printer implements Printable{
        @Override
        public void print() {
            System.out.println(con);
        }
    }

}

public class ex02 {
    public static void main(String[] args) {
        Papers papers = new Papers("vdfasdf");
        Printable print = papers.getPrint();
        print.print();


    }


}



