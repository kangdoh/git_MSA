package org.example;

public class EXAM {

    public static int minValue(int[] arr){
        int min = arr[0];
        for(int i =0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
//    public static int maxValue(int[] arr){
//        int max = arr[0];
//        for(int i =0; i<arr.length; i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    public static int maxValue(int[] arr){
        int max = arr[0];
        for(int temp:arr){
            if(max < temp){
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,500,52,13};
        minValue(arr);
        maxValue(arr);

        System.out.println(minValue(arr));
        System.out.println(maxValue(arr));
    }
}
