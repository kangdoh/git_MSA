package org.example;

public class BoxFactory {

    public static <T> void peekBox(Box<T> box){
        System.out.println(box);
    }

    //  Number 밑으로 사용(extends)
    //  (super)는 위로 사용가능
    public static void peekBox2(Box<? extends Number> box){
        System.out.println(box);
    }

    public static void peekBox4(Box<? extends AA> box){
        System.out.println(box);
    }
    public static void peekBox5(Box<? extends BB> box){
        System.out.println(box);
    }

    // 하한제한(extends는 get만 가능)
    public static void peekBox6(Box<? extends AA> box){
        AA getbox = box.getT();
        System.out.println(getbox);
//        box.setT(new AA());
    }

    // 상한제한 (super는 set만 가능)
    public static void peekBox7(Box<? super AA> box){
//        AA getbox = box.getT();
//        System.out.println(getbox);
        box.setT(new AA());
    }

    public static <T> T getMyBox(Box<? extends T> box){
        return box.getT();
    }

}