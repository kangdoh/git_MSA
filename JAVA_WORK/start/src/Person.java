//필자가 좋아하는 것 중 하나가 금요일 저녁 퇴근길에 DVD나 만화책을 잔뜩 빌리고,
//동네 슈퍼에 들러서 군것질거리를 사 가지고 집에 들어가는 것이다.
//오늘은 금요일이다. 현재 필자의 주머니에는 5천 원이 있다.
//DVD 한 편을 빌리면 3,500원이 남는다.
//슈퍼에 들려서 크림빵(500원), 새우깡(700원), 콜라(400원)를 사려한다.
//잔돈을 하나도 남기지 않고 이 세 가지 물건을 하나 이상 반드시 구매하려면
//어떻게 구매를 진행해야 하겠는가? 물론 여기에는 여러 가지 경우의 수가 있을 것이다.

import java.util.Scanner;

public class Person{
    public static void main(String[] args) {
        System.out.println("빌리 DVD의 갯수를 입력해 주세요.");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        int money = 5000;
        int dvd = 1500;

        if(i*1500<5000){
            int cream = 500;
            int snak = 700;
            int coke = 400;

            int count = 0;

            int changeMoney = money-(dvd*i);
            System.out.println("잔돈 :"+changeMoney);

            for(int a=0; cream*a<=changeMoney; a++){
                int aa = changeMoney-cream*a;
                if(aa == 0){
                    count++;
                    System.out.println("크림빵 = "+a+"\t"+"새우깡 = "+0+"\t"+"콜라 = "+0);
                }
                else{
                    for(int b=0; snak*b<=aa; b++){
                        int bb = aa-snak*b;
                        if(bb == 0){
                            count++;
                            System.out.println("크림빵 = "+a+"\t"+"새우깡 = "+b+"\t"+"콜라 = "+0);
                        }
                        else{
                            for(int c=0; coke*c<=bb; c++){
                                int cc = bb-coke*c;
                                if(cc == 0){
                                    count++;
                                    System.out.println("크림빵 = "+a+"\t"+"새우깡 = "+b+"\t"+"콜라 = "+c);
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("경우의 수는 "+count+"가지다.");
        }else{
            System.out.println("돈이 부족합니다.");
        }






    }
}
