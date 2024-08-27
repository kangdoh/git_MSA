package org.example;

interface Calculate{
    void cal(int a, String b);
}

interface RETCAL{
    int call(int a, int b);
}


public class ex01 {
    public static void main(String[] args) {

        RETCAL rc = (a, b)->{
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            return a+b;
        };

        int result = rc.call(10, 20);
        System.out.println(result);



        Calculate c1 = new Calculate() {
            @Override
            public void cal(int num, String text) {
                System.out.println(num+text);
            }
        };
        c1.cal(10 , "dfa");

        Calculate c2 = (int a, String b)->{
            System.out.println(a+b);
        };
        c2.cal(10, "람다계산");
    }
}
