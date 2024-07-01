package ex001;
import java.util.Scanner;

public class exam {

    public static void main(String[] args) {
        // double c;
		// Scanner scan = new Scanner(System.in);
		// c = scan.nextDouble();
        // System.out.println(c);10
        // int intV = (int)(c*100);
        // System.out.println(intV);
    
        Scanner scan = new Scanner(System.in);
        double doubleV = scan.nextDouble();
        int intV = (int)(doubleV*100);

        System.out.println(intV);
        System.out.println(intV/(double)100);
        

    }
}