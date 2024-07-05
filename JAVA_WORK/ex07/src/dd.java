import java.util.Scanner;

public class dd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇까지 더할까요?");
        int test = scanner.nextInt();

        doa(test);
        dob(test);
    }

    // 1~10까지 더하기
    public static void doa(int end){
        int sum = 0;
        for(int i =1; i<end+1; i++){
            sum+=i;
        }
        System.out.println(end+"를 받아와서");
        System.out.println("더하기 값은 = "+sum);
    }

    // 1~10까지 곱하기
    public static void dob(int end){
        int sum = 1;
        for(int i =1; i<end+1; i++){
            sum = sum * i;
        }
        System.out.println(end+"를 받아와서");
        System.out.println("곱하기 값은 = "+ sum);
    }

}
