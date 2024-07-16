import java.util.Arrays;
import java.util.Scanner;

//두 개의 정수를 입력받아서 최대 공약수(GCD)를 구하는 프로그램을 작성해 보자.
public class ex02 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();


        int more;
        if(a>b){more = a;}
        else {more = b;}
        System.out.println(more);


        for (int i = 1; i <= more; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
            }
        }

    }
}