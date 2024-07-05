import java.util.Scanner;

public class exam {

    public static void main(String[] args) {

//  1.  두개의 주사위던졌을때 눈의합이 6이 되는 경우의 수를 출력
//        int sum = 0;
//        for(int i=1; i<7; i++){
//            for(int a = 1; a<7; a++){
//                if(i+a == 6){
//                    System.out.println("6이 되는 경우의 수는 = " + a +"+"+ i);
//                    sum++;
//                }
//            }
//        }
//        System.out.println(sum +"가지 경우의 수");


//  2.  math random을 이용 1~6 사이의 양의 정수를 변수 value에 저장 (1)에 알맞은 코드
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int total = 0;

        while(true){
            double num = Math.random()*10;
            int inum = (int) (num);
            if(1<=inum && inum<=6){
                total++;
                System.out.println(inum);
            }
            if(total<input)
            continue;

            System.out.println("value = " + total + "가지");
            break;
        }



    }
}
