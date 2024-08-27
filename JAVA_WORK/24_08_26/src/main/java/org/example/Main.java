package org.example;

import java.util.*;

class MyComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Robot", "box", "lamda", "AA", "기역", "Box");
        list = new ArrayList<>(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

//        Collections.sort(list,(a,b) -> b.length()-a.length());
//        System.out.println(list);

        MyComparator myComparator = new MyComparator();
        Collections.sort(list,myComparator);
        
        

    }
}