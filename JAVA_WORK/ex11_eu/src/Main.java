import java.util.Scanner;

class Fact{
    public int fact(int num){
        System.out.println("여기오나"+num);

        //메서드는 반환값을 적게 되면 반환값이 무조건 있어야 함

        if(num>0){
            return 2*fact(num - 1);
        }
        else{
            return 1;
        }


        //fact();

    }
}

public class Main {
    public static void main(String[] args) {
        /*
            String -> int      Interger.parseInt
            int -> String      10+"";
            문자열 입력 scan.nextLine
            숫자 입력 scan.nextInt
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇승 구할래?");

        String a = scanner.nextLine();
        int num = Integer.parseInt(a);
        // ㄴ문자를 숫자로 받음

        Fact fact = new Fact();
        int result = fact.fact(num);
        System.out.println("result = "+result);

//        System.out.println(a);
//        System.out.println(num);

//        int num = scanner.nextaInt();

        // 클래스의 정의와 인스턴스화


    }
}