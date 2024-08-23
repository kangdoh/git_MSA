package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {

        List<Car> list = Arrays.asList(
                new Car("그랜져", 3000),
                new Car("K8", 3500),
                new Car("쏘렌토", 2200)
        );

        // 순번을 골라 하나를 출력하는 방법
        System.out.println(list.get(0));

        // 반복문을 활용하여 전체 출력방법
        for(Car car:list){
            System.out.println(car);
        }

        // 정렬하는 방법
        // (다른 파일에서 인스턴스? 가져오는상황에는) implements Comparable
        Collections.sort(list);
        System.out.println(list);


        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getDisp() - o1.getDisp();
            }
        });
        System.out.println(list);

        // 람다로 변경시
        // Collections.sort(list,(((o1, o2) -> o2.getDisp()- o1.getDisp())));


    }
}
