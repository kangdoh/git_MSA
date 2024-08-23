package org.example;

import java.util.*;

public class ex01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Toy", "Robot", "Apple");

        // 배열 추가시 이렇게 인스턴스 만들어서 추가
        list = new ArrayList<>(list);
        
        list.add("추가추가");
        System.out.println(list);

        // 정렬
        Collections.sort(list);
        System.out.println(list);

        // list를 하나씩 temp에 담아준다라고 생각하면 된다.
        // 반복문이기에 하나씩 출력된다.
        for(String temp:list){
            System.out.println(temp);
        }

        // Iterator라는 반복자
        for (Iterator<String> itr= list.iterator(); itr.hasNext();){
            System.out.println(itr.next());
        }




    }
}
