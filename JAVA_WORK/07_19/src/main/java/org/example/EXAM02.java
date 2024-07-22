//2. 다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.
//public static void addOneDArr(int[] arr, int add){
//    for(int i =0; i<arr.length; i++){
//        arr[i] += add;
//    }
//}
//위 메소드를 호출하는 형태로, int형 2차원 배열에 저장된 값 전부를 두번째 매개변수로 전달된 값의 크기만큼
//증가시키는 메소드를 다음의 형태로 정의하자
//public static void addTwoDArr(int[][] arr, int add){
//    // 이안에 addOneDArr 메소드를 호출한다.
//}
package org.example;
import java.util.Arrays;

public class EXAM02 {


    public static void addTwoDArr(int[][] arr, int add){
        for(int i =0; i< arr.length; i++){
            int [] a = arr[i];
            addOneDArr(a, add);
        }
    }

    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int [][] arr = new int[][]{{1,2,3,45,5},{0,0,0,0,0},{1,2,3,45,5}};
        int add = 110;
        addTwoDArr(arr, add);
    }

// 그냥 함수는 return값이 없다면 값이 main 메서드로 돌아오지 않지만,
//    배열함수는 return이 없더라도 그 값이 main 메서드로 돌아온것과 같이 값이 변하게 된다.
//    그러한 이유는 참조변수의 특성때문이다.
// 기본 함수는 전달 받은 값으로 복사하는 개념이라면, 배열함수는 전달받은 값을 공유하는 느낌이다.

// 그럼 이러한 상황에 주의해야 하는 상황은 다른 메서드라도 같은 배열을 사용하기에 코드가변하지 않게
// 조심해야 한다는 것이고, 편리한 것은 굳이 값을 다시 받아와 사용하는 번거러움이 사라진다는 것이다.
    
    

}