package 연습;

public class Ex3 {
    public int ex2(int a) {

        int c =a;
        int result = 0;
        for (int i = 1; i < 10; i++) {
            result = ( c *(i - 1))+ c;

        }
        return result;
    }
}
