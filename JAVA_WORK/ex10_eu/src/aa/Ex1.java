package aa;

public class Ex1 {
    public static void main(String[] args) {

        for (int i = 1; i<10; i++) {
            int num1 = (2 * (i - 1)) + 2;
            int num2 = (3 * (i - 1)) + 3;

            System.out.print("2*"+i+"="+num1);
            System.out.print("\t");
            System.out.print("3*"+i+"="+num2+"\n");

        }

    }
}

