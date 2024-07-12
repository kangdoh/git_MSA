import aa.CalSecond;

/*
    프로그램 사용자로부터 초(second)를 입력받은 후에,
    이를 [시, 분, 초]의 형태로 출력하는 프로그램을 작성해보자.
 */
public class Main {
    public static void main(String[] args) {

        CalSecond calSecond = new CalSecond();

        int retValue = calSecond.inputNumber();
        System.out.println(retValue);

        String resulValue = calSecond.calculate(retValue);
        System.out.println(resulValue);

//        System.out.println(calSecond.inputNumber());


//        CalSecond calSecond2 = calSecond;

        // toString 함수는 생략 가능함

//        System.out.println(calSecond);
//        System.out.println(calSecond2);



    }


}
