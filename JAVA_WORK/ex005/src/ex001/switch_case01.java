package ex001;

public class switch_case01 {
	public static void main(String[] args) {
	
		int n = 3;
		
		switch (n) {
		case 1: {
			System.out.println("n은 1입니다.");
			break;
		}
		case 2: {
			System.out.println("n은 2입니다.");
			break;
		}
		case 3: {
			System.out.println("n은 3입니다.");
			break;
		}
		case 4: {
			System.out.println("n은 4입니다.");
			break;
		}
		default:
			break; //break는 멈추는 역할
		}
		
		
//		if(n == 1) {
//			System.out.println(1);
//		}
//		else if( n==2 || n==3 || n==4) {
//			System.out.println(2);
//			System.out.println(3);
//			System.out.println(4);
//		}
		
		System.out.println("종료 됩니다.");
	}
}

