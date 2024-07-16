//방정식 의 모든 해를 구하시오 단 와 는 정수이고 각각의
// 범위는 2x+4y=10 . , x y
//0<=x<=10, 0<=y<=10 .

import java.util.Arrays;

public class ex03 {

    public static void main(String[] args) {

        for(int x=0; 0<=x && x<=10; x++){

            for(int y=0; 0<=y && y<=10; y++){
                int result = 2*x+4*y;

                if(result==10){
                    System.out.println("x는 = "+x);
                    System.out.println("y는 = "+y);
                    System.out.println();

                }

            }

        }


    }

}
