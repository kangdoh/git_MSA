package ex001;

import java.util.Scanner;

public class while02 {
	public static void main(String[] args) {

		int n = 0;
		
		Scanner scan = 
		
		while (true) {
			n++;

			System.out.println("n=" + n);
			
			if (n == 3)
			break;
			continue;
		
			int temp = scan.nextInt();
			System.out.println("temp = " + temp);
		
		}

		
//	break; 는 멈추게 되는 코드
		
//	continue; 는 멈추지 않고 건너 뛰어 계속되는 느낌?
//	(반복문으로 예시를 들면 다음 코드를 진행하지 않고 다시 반복문 처음으로 돌아가는 상황)
//	밑에 코드를 제외 하고 계속해 ~ 이 말입니다. 		
		
		
		
	}
}
