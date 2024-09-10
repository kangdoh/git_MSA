package org.pmh;

import org.pmh.components.CC;

public class EX02 {

    public static void main(String[] args) {

//        CC cc = new CC();
        CC cc1 = CC.getInstance();
        System.out.println(cc1);

        CC cc2 = CC.getInstance();
        System.out.println(cc2);

        System.out.println(cc1==cc2);
    }
}
