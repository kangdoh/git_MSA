package org.example;

import java.util.Arrays;

public class ex04 {
    public static void main(String[] args) {
        int arr[] = {10,2,3,4,5,19};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int a:arr){
            System.out.println(a);
        }

    }
}
