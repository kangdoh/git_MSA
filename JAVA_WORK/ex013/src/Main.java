import java.util.Scanner;

//    10진수를 입력 받아서 2진수로 만드는 방법
class Exam{
    Scanner scan = new Scanner(System.in);
    public int inputNumber(){
        System.out.println("숫자입력");

        int inputNumber = scan.nextInt();
        System.out.println(inputNumber);
        return inputNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam();
        int result = exam.inputNumber();
        System.out.println("main result = " + result);

        int value,나머지;
        value = result/2;
        나머지 = result%2;

        System.out.println("몫 =" + value);
        System.out.println("나머지 =" + 나머지);

        String 나머지들 = ""+나머지;

        while(true){
            나머지 = value%2;
            value = value/2;
            나머지들 = 나머지 + 나머지들;
            
            System.out.println("몫 =" + value);
            System.out.println("나머지 =" + 나머지);
            System.out.println(나머지들);
            
            if(value<2){
                if(value != 0){
                    나머지들 = value + 나머지들;
                    System.out.println(나머지들);
                }
                break;
            }

        }

    }
}





