package ex006;

import java.util.Scanner;

public class ex009 {

//	public static int doA(int num) {
//		return num * num;
//	}
//	
//	public static void main(String[] args) {
//	
//		Scanner scan = new Scanner(System.in);
//			while(true) {
//				int input = scan.nextInt();
//				System.out.println(input);
//				System.out.println(doA(input));
//			}
//		
//	}
	
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		int select = scan.nextInt();
	
		if(select == 1) {
			doA();
		}
		else if(select == 2) {
			doB();
		}
		
	}
	
	public static void doA() {
		System.out.println("doA 함수");
	}
	
	public static void doB() {
		System.out.println("doB 함수");
	}
	
	
}
