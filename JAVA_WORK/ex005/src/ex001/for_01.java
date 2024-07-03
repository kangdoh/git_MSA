package ex001;

//import java.util.Iterator;

public class for_01 {
	public static void main(String[] args) {
		
		int n =10;
		while(n>8) {
			System.out.println(n);
			n--;
		}
		//	위의 while 문법을 for 로 바꾸면 아래와 같다.
		for (int i = 10; i > 8; i--) {
			System.out.println(i);
		}
		
		
		
		
		for (int l = 0; l < 5; l++) {
			System.out.println("I love java" + l);
		}
	}
}
