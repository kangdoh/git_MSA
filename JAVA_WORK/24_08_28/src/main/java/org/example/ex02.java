package org.example;

import java.util.function.ToIntBiFunction;

class IBox{
    private int n;
    public IBox(int n) {
        this.n = n;
    }
    public int lager(IBox b){
        if(n>b.n)
            return n;
        else
            return b.n;
    }
}


public class ex02 {
    public static void main(String[] args) {

        ToIntBiFunction<IBox,IBox> toIntBiFunction = (iBox, iBox2) -> iBox.lager(iBox2);
        int result = toIntBiFunction.applyAsInt(new IBox(5), new IBox(7));
        System.out.println("result ="+result);


        String s = "abc";
        String s2 = "abc";
        System.out.println(s.equals(s2));


    }
}