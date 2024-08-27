package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//interface myPred<T>{
//    boolean mytest(T t);
//}

public class ex04 {
    // Predicate boolean 사용시 (ex. java에서 만들어주는 myPred<T> 라고 생각하자)
    public static int sum(Predicate<Integer> predicate, List<Integer> list){
        int mysum = 0;
        for(int n:list){
            if(predicate.test(n))
                mysum++;
        }
        return mysum;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,5,10,1,15,20,2000,105);

        int result = sum(integer -> integer%2==0 , list);
        System.out.println(result);
    }
}