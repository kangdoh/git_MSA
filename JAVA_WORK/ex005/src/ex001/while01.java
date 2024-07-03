package ex001;

import java.util.Scanner;

public class while01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// while 은 반복문, 조건이 맞으면 들어온다.
		while(true) {
			
			int num = scan.nextInt();
			System.out.println("num = "+num);
		
			if(num==0){break;}
		}		
		System.out.println("종료되었습니다.");
	}
}

// 반복문이기 때문에 계속해서 입력이 되고 다시 위로 돌아간다.
// break 작동 후에는 반복이 종료 되어 입력 불가 상태가 된다.