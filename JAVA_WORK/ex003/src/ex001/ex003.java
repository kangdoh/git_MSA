package ex001;

import java.util.Scanner;
public class ex003 {

	//	두수를 입력받아 곱과, 나누어 몫과 나머지를 구하시오.
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int a;
	int b;
	
	a = scan.nextInt();
	b = scan.nextInt();

	System.out.println("a*b(곱하기) = "+a*b);
	System.out.println(a+"x"+b+"="+a*b);
	
	System.out.println("a/b(몫) = "+a/b);
	System.out.println("a%b(나머지) = "+a%b);
		
		
	}	
}