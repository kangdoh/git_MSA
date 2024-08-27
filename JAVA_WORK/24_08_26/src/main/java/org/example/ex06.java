package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex06 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(11,22,33,44,55,66,77,88,99);
        list = new ArrayList<>(list);

        list.removeIf(integer -> integer%2==0);
        System.out.println(list);


        // list의 값을 temp에 하나하나 넣겠다 라는뜻.
        for(int temp : list){
//            System.out.println(temp);
        }

        //  위식(for-each)과 아래의식(for)은 같은 말이다.
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            System.out.println("temp =" + temp);
            if(temp %2 ==0){
                list.remove(i);
            }
        }




    }
}
