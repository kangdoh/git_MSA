package ex001;

import java.util.Scanner;

public class ex005 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		
		
//		System.out.println(a);
		
		if(a<10) {
			System.out.println("10미만");
		}else if(10 <= a && a <= 20) {
			System.out.println("10이상 20이하");
		}else {
			System.out.println("20초과");
		}
		
		
		
	}
}
