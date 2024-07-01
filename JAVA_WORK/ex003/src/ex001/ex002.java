package ex001;

// Scanner 를 사용하기 위한 ★필수 import(Scanner + ctrl+space)
import java.util.Scanner;


public class ex002 {

	public static void main(String[] args) {
		
	// 숫자를 입력 받아 두수 합을 구하시오.
	int a;
	int b;
	
	// 무엇인가를 입력 받아서 사용할때 쓰는 문법
	Scanner scan = new Scanner(System.in);
	System.out.println("숫자 입력");
	
	
	// a변수에 숫자 입력 받아 넣는 구문(실행창에서 입력을 받는다.)
	a = scan.nextInt();		
	System.out.println("a = "+a);
	// b변수에 숫자 입력 받아 넣는 구문(실행창에서 입력을 받는다.)
	b = scan.nextInt();		
	System.out.println("b = "+b);
	
	
	
	System.out.println("a+b = "+(a+b));
	}
}
