package org.example.print;

import org.example.inter.CMYKPrintalbe;

public class CMYKPrinter implements CMYKPrintalbe {

    @Override
    public void printCMYK(String doc) {
        System.out.println("컬러 프린터기");
        System.out.println(doc);
    }

    @Override
    public void print(String mydoc) {
        System.out.println("흑백 프린터기");
        System.out.println(mydoc);
    }


}