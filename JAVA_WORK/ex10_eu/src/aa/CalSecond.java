package aa;

import java.util.Scanner;

public class CalSecond {
    //ㄴAlt+Enter해서 rename으로 파일명과 class명 일치시키기

    // 초를 입력받는 함수

    // 밑에 함수에 int 적으면 int 리턴, void 적으면 리턴값X
    public int inputNumber(){
        System.out.println("초입력: ");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

    // int를 넘겨주면 String을 반환하는 함수
    // 21647 -> 6시간 47초
    public String calculate(int second){
        int hour = second / 3600;
        int min = (second%3600)/60;
        int sec = (second%3600)%60;
        return hour+"시간"+min+"분"+sec+"초";
    }




    // int를 넘겨주면 String을 반환하는 함수
    // toString은 생략되어짐
    // public String toString()
    // return은 내 마음대로


}
