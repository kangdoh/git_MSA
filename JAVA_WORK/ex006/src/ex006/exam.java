package ex006;

//for문을 while로 변경

public class exam {

	// 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
	// 1번 문제
//	public static void main(String[] args) {
//		int num = 0;
//		int sum = 0;
//		
//		while(num<20) {	
//			num++;
//			if(num%2!=0 && num%3!=0) {			
//				System.out.println(sum+=num);						
//			}
//		}
//		System.out.println(sum);
//	}

	
	
	// 1+(1+2)+(1+2+3)+... (1+...+10)과 같은 식으로 했을때 몇이 되는지 구하시오.
	// 2번 문제
//	public static void main(String[] args) {
//		int a = 0;
//		int sum = 0;
//		int total = 0;
//		while (a < 10) {
//			a++;
//			sum = sum + a;
//			System.out.println(sum);
//			
//			total+=sum;
//		}
//		System.out.println(total);
//	}
	

	
	// 1+(-2)+3+(-4)... 몇까지 더해야 100이상이 되는가.
	// 3번 문제
public static void main(String[] args) {

	int p = 1;
	int m = -2;
	
	int i = -1;
	while(i<100){
		
		i++;
		int P = p+i*2;	
		int M = m-i*2;

		
		
	}
}

	
	
	
	
	
	
	
	
	
		
	
}