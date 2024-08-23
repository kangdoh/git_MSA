package org.example;

import java.util.ArrayList;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {

        // ArrayList와 LinkedList의 차이는
        // ArrayList(조회)는 앞의 개체가 삭제되면 순번이 앞으로 밀려 순번이 정렬이 된다.
        // LinkedList(수정,삭제)는 ~~ 비슷하다.(원리차이)

        List<String> list = new ArrayList();

        list.add("toy");
        list.add("robot");
        list.add("box");

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.remove(0);

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("김길동", 30);

        System.out.println(p1);
        System.out.println(p2);

        List<Person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);

        System.out.println(plist);

    }
}